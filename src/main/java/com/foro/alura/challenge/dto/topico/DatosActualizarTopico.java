package com.foro.alura.challenge.dto.topico;


import com.foro.alura.challenge.modelo.Curso;
import com.foro.alura.challenge.modelo.Estado;
import com.foro.alura.challenge.modelo.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        Estado estado,
        @NotNull
        Long autorId,
        @NotNull
        Long cursoId) {
}