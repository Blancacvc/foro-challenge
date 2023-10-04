package com.foro.alura.challenge.dto.respuesta;

import com.foro.alura.challenge.modelo.Curso;
import com.foro.alura.challenge.modelo.Topico;
import com.foro.alura.challenge.modelo.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizarRespuesta(
        @NotNull
        Long id,
        @NotBlank
        String mensaje,
        @NotNull
        Long topicoId,
        @NotBlank
        Long autorId,
        @NotNull
        Boolean solucion) {
}