package org.example.refactoring.ejercicio2.uno.v1;


public class EmpleadoPasante {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;

    public double sueldo() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}

