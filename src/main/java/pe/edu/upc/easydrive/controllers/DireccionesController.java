package pe.edu.upc.easydrive.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easydrive.dtos.DireccionesDTO;
import pe.edu.upc.easydrive.entities.Direcciones;
import pe.edu.upc.easydrive.servicesinterfaces.IDireccionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/direcciones")
public class DireccionesController {
    @Autowired
    private IDireccionesService dS;

    @GetMapping
    public List<DireccionesDTO> listar() {
        return dS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DireccionesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody DireccionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Direcciones d = m.map(dto, Direcciones.class);
        dS.insert(d);
    }

    @GetMapping("/{id}")
    public DireccionesDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        return m.map(dS.listId(id), DireccionesDTO.class);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        dS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody DireccionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Direcciones d = m.map(dto, Direcciones.class);
        dS.update(d);
    }

}
