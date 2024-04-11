package org.example.ejercicio6;

public abstract class Empleado {
    private String nombreCompleto;
    private String dni;
    private Double baseFija;
    private boolean casado;
    private int hijos;

    public Empleado(String nombre, String dni, Double basico, boolean casado, int hijos){
        this.nombreCompleto = nombre;
        this.dni = dni;
        this.baseFija = basico;
        this.casado = casado;
        this.hijos = hijos;
    }




    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setBaseFija(Double sueldo){
        this.baseFija = sueldo;
    }

    public Double getBaseFija(){
        return this.baseFija;
    }

    public Double calcularSueldo(){
        return this.calcularBasico() + this.calcularAdicional() - this.calcularDescuento();
    }

    public Double calcularBasico(){
        return this.baseFija;
    }
    public Double calcularAdicional(){
        return (this.isCasado()) ? (5000.0 + 2000.0 * this.getHijos()) : 2000.0*this.getHijos();
    }
    public Double calcularDescuento(){
        return this.calcularBasico()*0.13 + this.calcularAdicional()*0.05;
    }

}
