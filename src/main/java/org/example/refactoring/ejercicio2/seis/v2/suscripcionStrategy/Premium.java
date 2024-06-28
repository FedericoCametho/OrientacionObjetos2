package org.example.refactoring.ejercicio2.seis.v2.suscripcionStrategy;

import org.example.refactoring.ejercicio2.seis.v2.Pelicula;

public class Premium extends Suscripcion{
    private static final double TASA_PREMIUM = 0.75;
    public Premium(){
        super(TASA_PREMIUM);
    }
}
