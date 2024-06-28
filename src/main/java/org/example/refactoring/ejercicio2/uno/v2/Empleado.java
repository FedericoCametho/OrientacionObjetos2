package org.example.refactoring.ejercicio2.uno.v2;

public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected double sueldoBasico;
    public Empleado(String nombre, String apellido, double sueldoBasico){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }

    public double calcularSueldo() {
        return this.calcularSueldoEspecifico() - this.descuentos();
    }

    protected abstract double calcularSueldoEspecifico();
    private double descuentos(){
        return this.sueldoBasico * 0.13;
    }
}
