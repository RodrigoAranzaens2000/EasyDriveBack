package pe.edu.upc.easydrive.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.easydrive.dtos.CentrosMedicosDTO;
import pe.edu.upc.easydrive.entities.CentrosMedicos;
import pe.edu.upc.easydrive.servicesinterfaces.ICentrosMedicosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Centros")
public class CentrosMedicosController {
    @Autowired
    private ICentrosMedicosService cS;

    @GetMapping
    public List<CentrosMedicosDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CentrosMedicosDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody CentrosMedicosDTO dto) {
        ModelMapper m = new ModelMapper();
        CentrosMedicos c = m.map(dto, CentrosMedicos.class);
        cS.insert(c);
    }

    @GetMapping("/{id}")
    public CentrosMedicosDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        return m.map(cS.listId(id), CentrosMedicosDTO.class);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody CentrosMedicosDTO dto) {
        ModelMapper m = new ModelMapper();
        CentrosMedicos c = m.map(dto, CentrosMedicos.class);
        cS.update(c);
    }

    @GetMapping("/busquedas")
    public List<CentrosMedicosDTO> BuscarEjemlo(String n) {
        return cS.buscar(n).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CentrosMedicosDTO.class);
        }).collect(Collectors.toList());
    }
}
