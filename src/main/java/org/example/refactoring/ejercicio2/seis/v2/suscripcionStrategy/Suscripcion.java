package org.example.refactoring.ejercicio2.seis.v2.suscripcionStrategy;

import org.example.refactoring.ejercicio2.seis.v2.Pelicula;

public abstract class Suscripcion {

    public double tasaDeSuscripcion;
    public Suscripcion(double tasaDeSuscripcion){
        this.tasaDeSuscripcion = tasaDeSuscripcion;
    }
    public double calcularCostoPelicula(Pelicula pelicula){
        return pelicula.calcularCargoTotalConExtraPorEstreno() * this.tasaDeSuscripcion;
    }

}
