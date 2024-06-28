package org.example.refactoring.ejercicio2.tres.v2;


import java.time.LocalDateTime;

public class Post {
    private String texto;
    private LocalDateTime fecha;
    private Usuario usuario;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public boolean isUser(Usuario usuario){
        return this.usuario.equals(usuario);
    }
}
