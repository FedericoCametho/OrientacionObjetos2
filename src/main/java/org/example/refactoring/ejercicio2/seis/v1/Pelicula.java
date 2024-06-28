package org.example.refactoring.ejercicio2.seis.v1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pelicula {
    LocalDate fechaEstreno;
    private String nombre;
    private  String genero;
    private double costo;

    public double getCosto() {
        return this.costo;
    }

    public double calcularCargoExtraPorEstreno(){
        // Si la Película se estrenó 30 días antes de la fecha actual, retorna un cargo de 0$, caso contrario, retorna un cargo extra de 300$
        return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > 30 ? 0 : 300;
    }
}

