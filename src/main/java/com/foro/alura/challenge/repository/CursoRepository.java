package com.foro.alura.challenge.repository;

import com.foro.alura.challenge.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
