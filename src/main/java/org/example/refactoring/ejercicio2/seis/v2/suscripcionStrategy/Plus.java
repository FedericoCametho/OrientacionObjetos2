package org.example.refactoring.ejercicio2.seis.v2.suscripcionStrategy;

import org.example.refactoring.ejercicio2.seis.v2.Pelicula;

public class Plus extends Suscripcion{
    private static final double TASA_PLUS = 1;
    public Plus(){
        super(TASA_PLUS);
    }
}
