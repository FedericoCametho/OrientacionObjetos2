package org.example.ejercicio6;

public class Temporario extends Empleado {

    private int horasTrabajadas;
    private static double tarifaPorHora = 300;

    private static double baseFija = 20000;

    public Temporario(String nombre, String dni, int horasTrabajadas, boolean casado, int hijos) {
        super(nombre, dni, baseFija, casado, hijos);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public Double calcularBasico() {
        return this.getBaseFija() + this.horasTrabajadas * tarifaPorHora;
    }

}

