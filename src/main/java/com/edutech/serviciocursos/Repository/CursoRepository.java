package com.edutech.serviciocursos.Repository;


import com.edutech.serviciocursos.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
