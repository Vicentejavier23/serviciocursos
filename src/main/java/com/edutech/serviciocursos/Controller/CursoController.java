package com.edutech.serviciocursos.Controller;

import com.edutech.serviciocursos.Model.Curso;
import com.edutech.serviciocursos.Service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private final CursoService servicio;

    public CursoController(CursoService servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Curso> obtenerTodos() {
        return servicio.listar();
    }

    @PostMapping
    public Curso crear(@RequestBody Curso curso) {
        return servicio.guardar(curso);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        servicio.eliminar(id);
    }
}
