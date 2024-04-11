package org.example.ejercicio6;

public class Pasante extends Empleado{

    private static double baseFija = 20000;
    private int examenes;
    public Pasante(String nombre, String dni, int examenes){
        super(nombre, dni, baseFija, false, 0);
        this.examenes = examenes;
    }



    @Override
    public Double calcularAdicional() {
        return this.examenes * 2000.0;
    }

}
