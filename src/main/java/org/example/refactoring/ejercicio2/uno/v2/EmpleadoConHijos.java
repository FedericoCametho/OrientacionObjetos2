package org.example.refactoring.ejercicio2.uno.v2;

public abstract class EmpleadoConHijos extends Empleado{
    protected int cantidadHijos;

    public EmpleadoConHijos(String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
        super(nombre, apellido, sueldoBasico);
        this.cantidadHijos = cantidadHijos;
    }
}
