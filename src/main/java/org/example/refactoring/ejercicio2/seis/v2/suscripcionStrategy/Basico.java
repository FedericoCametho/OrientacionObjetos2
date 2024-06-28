package org.example.refactoring.ejercicio2.seis.v2.suscripcionStrategy;

import org.example.refactoring.ejercicio2.seis.v2.Pelicula;

public class Basico extends Suscripcion {
    private static final double TASA_BASICO = 1;
    public Basico(){
        super(TASA_BASICO);
    }
}
