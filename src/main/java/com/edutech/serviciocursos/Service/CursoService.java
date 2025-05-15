package com.edutech.serviciocursos.Service;

import com.edutech.serviciocursos.Model.Curso;
import com.edutech.serviciocursos.Repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository repo;

    public CursoService(CursoRepository repo) {
        this.repo = repo;
    }

    public List<Curso> listar() {
        return repo.findAll();
    }

    public Curso guardar(Curso curso) {
        return repo.save(curso);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
