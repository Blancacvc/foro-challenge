package com.foro.alura.challenge.dto.topico;

import com.foro.alura.challenge.dto.curso.DatosRespuestaCurso;
import com.foro.alura.challenge.dto.usuario.DatosRespuestaUsuario;
import com.foro.alura.challenge.modelo.Topico;

public record DatosRespuestaTopicoId(Long id, String titulo, String mensaje, String fechaCreacion, String estado, DatosRespuestaUsuario autor,
                                     DatosRespuestaCurso curso) {

    public DatosRespuestaTopicoId(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion().toString(),
                topico.getEstado().toString(), new DatosRespuestaUsuario(topico.getAutor()),
                new DatosRespuestaCurso(topico.getCurso()));
    }
}