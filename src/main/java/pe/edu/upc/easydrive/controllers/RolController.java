package pe.edu.upc.easydrive.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easydrive.dtos.RolDTO;
import pe.edu.upc.easydrive.dtos.ServicioDTO;
import pe.edu.upc.easydrive.entities.Rol;
import pe.edu.upc.easydrive.entities.Servicio;
import pe.edu.upc.easydrive.servicesinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Roles")
public class RolController {
    @Autowired
    private IRolService rR;

    @GetMapping
    public List<RolDTO> listar() {
        return rR.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RolDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody RolDTO dto) {
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rR.insert(r);
    }

    @GetMapping("/{id}")
    public RolDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        return m.map(rR.listId(id), RolDTO.class);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        rR.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody RolDTO dto) {
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rR.update(r);
    }

    @GetMapping("/busquedas")
    public List<RolDTO> BuscarEjemlo(String n) {
        return rR.buscar(n).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RolDTO.class);
        }).collect(Collectors.toList());
    }

}
