package org.example.refactoring.segundaFecha.v1;

public class Producto {
    private double precio;
    private double IVA;

    public Producto(double precio, double IVA) {
        this.precio = precio;
        this.IVA = IVA;
    }

    public double getPrecio() {
        return precio;
    }

    public double getIVA() {
        return IVA;
    }
}
