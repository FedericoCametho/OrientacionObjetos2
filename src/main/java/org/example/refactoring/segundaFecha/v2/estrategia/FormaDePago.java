package org.example.refactoring.segundaFecha.v2.estrategia;

import org.example.refactoring.segundaFecha.v2.Producto;

import java.util.List;

public abstract class FormaDePago {

    public abstract double calcularMontoFinal(List<Producto> productos);
    public double calcularMontoProductos(List<Producto> productos){
        return productos.stream().mapToDouble(Producto::calcularPrecioConIva).sum();
    }



}
