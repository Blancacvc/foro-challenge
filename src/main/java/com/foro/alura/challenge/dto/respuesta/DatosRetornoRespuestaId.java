package com.foro.alura.challenge.dto.respuesta;

import com.foro.alura.challenge.dto.topico.DatosRespuestaTopico;
import com.foro.alura.challenge.dto.usuario.DatosRespuestaUsuario;
import com.foro.alura.challenge.modelo.Respuesta;

public record DatosRetornoRespuestaId(String mensaje, DatosRespuestaTopico topico, String fechaCreacion, DatosRespuestaUsuario autor, String solucion) {

    public DatosRetornoRespuestaId(Respuesta respuesta) {
        this(respuesta.getMensaje(), new DatosRespuestaTopico(respuesta.getTopico()), respuesta.getFechaCreacion().toString(),
                new DatosRespuestaUsuario(respuesta.getAutor()), respuesta.getSolucion().toString());
    }
}
