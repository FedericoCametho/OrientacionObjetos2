package org.example.ejercicio8;

public class Usuario {
    private String nombre;
    private String apellido;
    private String email;


    public Usuario (String nom, String ape, String email){
        this.nombre = nom;
        this.apellido = ape;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
