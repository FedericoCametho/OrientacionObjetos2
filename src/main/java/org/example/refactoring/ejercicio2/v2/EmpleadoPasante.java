package org.example.refactoring.ejercicio2.v2;


public class EmpleadoPasante extends Empleado {


    public EmpleadoPasante(String nombre, String apellido, double sueldoBasico) {
        super(nombre, apellido, sueldoBasico);
    }

    @Override
    protected double calcularSueldoEspecifico() {
        return this.sueldoBasico;
    }
}

