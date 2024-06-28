package org.example.refactoring.ejercicio2.cuatro.v2;

public class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double getPrecioItemCarrito() {
        return this.producto.getPrecio() * this.cantidad;
    }
}

