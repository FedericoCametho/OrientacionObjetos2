package org.example.refactoring.ejercicio2.v2;

public class EmpleadoTemporario extends EmpleadoConHijos{

    private double horasTrabajadas;
    private static double VALOR_PLUS_POR_HIJO = 1000;
    private static double VALOR_PLUS_POR_HORA_TRABAJADA = 500;

    public EmpleadoTemporario(String nombre, String apellido, double sueldoBasico, double horasTrabajadas, int cantidadHijos) {
        super(nombre, apellido, sueldoBasico, cantidadHijos);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected double calcularSueldoEspecifico() {
        return this.sueldoBasico + (this.horasTrabajadas * VALOR_PLUS_POR_HORA_TRABAJADA) + (this.cantidadHijos * VALOR_PLUS_POR_HIJO);
    }


}
