package org.example.refactoring.ejercicio2.seis.v2;

import org.example.refactoring.ejercicio2.seis.v2.suscripcionStrategy.Suscripcion;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private Suscripcion tipoSubscripcion;
    private String nombre;
    private int telefono;
    private String email;
    private List<Pelicula> peliculasCompradas;

    public Usuario(Suscripcion tipoSubscripcion, String nombre, int telefono, String email) {
        this.tipoSubscripcion = tipoSubscripcion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.peliculasCompradas = new ArrayList<>();
    }

    public void setTipoSubscripcion(Suscripcion unTipo) {
        this.tipoSubscripcion = unTipo;
    }

    public double calcularCostoPelicula(Pelicula pelicula) {
       return this.tipoSubscripcion.calcularCostoPelicula(pelicula);
    }
}

