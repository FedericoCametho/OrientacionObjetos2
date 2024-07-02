package org.example.refactoring.segundaFecha.v2;

public class Producto {
    private double precio;
    private double IVA;

    public Producto(double precio, double IVA) {
        this.precio = precio;
        this.IVA = IVA;
    }
    public double calcularPrecioConIva(){
        return this.precio + (this.precio * this.IVA);
    }
}
