package pe.edu.upc.easydrive.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easydrive.dtos.NotificacionesDTO;
import pe.edu.upc.easydrive.entities.Notificaciones;
import pe.edu.upc.easydrive.servicesinterfaces.INotificacionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionesController {
    @Autowired
    private INotificacionesService nS;

    @GetMapping
    public List<NotificacionesDTO> listar() {
        return nS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, NotificacionesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody NotificacionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Notificaciones n = m.map(dto, Notificaciones.class);
        nS.insert(n);
    }

    @GetMapping("/{id}")
    public NotificacionesDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        return m.map(nS.listId(id), NotificacionesDTO.class);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        nS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody NotificacionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Notificaciones n = m.map(dto, Notificaciones.class);
        nS.update(n);
    }

    @GetMapping("/busquedas")
    public List<NotificacionesDTO> BuscarEjemlo(String n) {
        return nS.buscar(n).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, NotificacionesDTO.class);
        }).collect(Collectors.toList());
    }
}
