package org.example.refactoring.ejercicio2.seis.v2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pelicula {
    public static final int LIMITE_DIAS_ESTRENO = 30;
    public static final int CARGO_EXTRA = 300;
    private LocalDate fechaEstreno;
    private String nombre;
    private  String genero;
    private double costo;

    public Pelicula(LocalDate fechaEstreno, String nombre, String genero, double costo) {
        this.fechaEstreno = fechaEstreno;
        this.nombre = nombre;
        this.genero = genero;
        this.costo = costo;
    }


    private double calcularCargoExtraPorEstreno(){
        // Si la Película se estrenó 30 días antes de la fecha actual, retorna un cargo de 0$, caso contrario, retorna un cargo extra de 300$
        return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > LIMITE_DIAS_ESTRENO ? 0 : CARGO_EXTRA;
    }

    public double calcularCargoTotalConExtraPorEstreno(){
        return this.costo + this.calcularCargoExtraPorEstreno();
    }
}

