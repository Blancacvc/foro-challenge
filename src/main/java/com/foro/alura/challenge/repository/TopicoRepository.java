package com.foro.alura.challenge.repository;

import com.foro.alura.challenge.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
