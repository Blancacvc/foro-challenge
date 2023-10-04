package com.foro.alura.challenge.dto.usuario;
import com.foro.alura.challenge.modelo.Tipo;

public record DatosActualizarUsuario(Long id, String nombre, String email, String contrasena, Tipo tipo) {
}