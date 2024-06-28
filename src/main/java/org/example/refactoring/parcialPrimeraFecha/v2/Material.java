package org.example.refactoring.parcialPrimeraFecha.v2;

public class Material {
    private String descripcion;
    private double precio;
    private double cantidad;

    public Material(String descripcion, double precio, double cantidad) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getCantidad(){
        return this.cantidad;
    }
    public double calcularPrecio(){
        return this.precio * this.cantidad;
    }
}
