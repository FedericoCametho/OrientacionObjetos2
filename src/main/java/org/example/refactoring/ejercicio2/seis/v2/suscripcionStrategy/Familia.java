package org.example.refactoring.ejercicio2.seis.v2.suscripcionStrategy;

import org.example.refactoring.ejercicio2.seis.v2.Pelicula;

public class Familia extends Suscripcion{
    private static final double TASA_FAMILIA = 0.9;

    public Familia(){
        super(TASA_FAMILIA);
    }
}
