package org.example.refactoring.ejercicio2.seis.v1;

import java.util.List;

public class Usuario {
    String tipoSubscripcion;
    private String nombre;
    private int telefono;
    private String email;
    private List<Pelicula> peliculasCompradas;

    public void setTipoSubscripcion(String unTipo) {
        this.tipoSubscripcion = unTipo;
    }

    public double calcularCostoPelicula(Pelicula pelicula) {
        double costo = 0;
        if (tipoSubscripcion=="Basico") {
            costo = pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
        }
        else if (tipoSubscripcion== "Familia") {
            costo = (pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno()) * 0.90;
        }
        else if (tipoSubscripcion=="Plus") {
            costo = pelicula.getCosto();
        }
        else if (tipoSubscripcion=="Premium") {
            costo = pelicula.getCosto() * 0.75;
        }
        return costo;
    }
}

