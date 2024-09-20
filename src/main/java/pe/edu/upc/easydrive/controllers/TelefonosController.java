package pe.edu.upc.easydrive.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easydrive.dtos.DireccionesDTO;
import pe.edu.upc.easydrive.dtos.TelefonosDTO;
import pe.edu.upc.easydrive.entities.Telefonos;
import pe.edu.upc.easydrive.servicesinterfaces.ITelefonosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/telefonos")
public class TelefonosController {
    @Autowired
    private ITelefonosService tS;

    @GetMapping
    public List<TelefonosDTO> listar() {
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TelefonosDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody DireccionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Telefonos t = m.map(dto, Telefonos.class);
        tS.insert(t);
    }

    @GetMapping("/{id}")
    public TelefonosDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        return m.map(tS.listId(id), TelefonosDTO.class);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        tS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody TelefonosDTO dto) {
        ModelMapper m = new ModelMapper();
        Telefonos t = m.map(dto, Telefonos.class);
        tS.update(t);
    }

    @GetMapping("/busquedas")
    public List<TelefonosDTO> BuscarEjemlo(String n) {
        return tS.buscar(n).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TelefonosDTO.class);
        }).collect(Collectors.toList());
    }

}
