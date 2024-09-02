package pe.edu.upc.easydrive.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easydrive.dtos.DireccionesDTO;
import pe.edu.upc.easydrive.dtos.ReservasDTO;
import pe.edu.upc.easydrive.dtos.TelefonosDTO;
import pe.edu.upc.easydrive.entities.Reservas;
import pe.edu.upc.easydrive.entities.Telefonos;
import pe.edu.upc.easydrive.servicesinterfaces.IReservasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Reservas")
public class ReservasController {
    @Autowired
    private IReservasService rS;

    @GetMapping
    public List<ReservasDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReservasDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody ReservasDTO dto) {
        ModelMapper m = new ModelMapper();
        Reservas r = m.map(dto, Reservas.class);
        rS.insert(r);
    }

    @GetMapping("/{id}")
    public ReservasDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        return m.map(rS.listId(id), ReservasDTO.class);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        rS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody ReservasDTO dto) {
        ModelMapper m = new ModelMapper();
        Reservas r = m.map(dto, Reservas.class);
        rS.update(r);
    }

    @GetMapping("/busquedas")
    public List<ReservasDTO> BuscarEjemlo(String n) {
        return rS.buscar(n).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReservasDTO.class);
        }).collect(Collectors.toList());
    }
}
