package org.example.refactoring.ejercicio1tres;

public class Empleado {
    private int edad;
    private double salario;

    public Empleado(int edad, double salario){
        this.edad  = edad;
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
