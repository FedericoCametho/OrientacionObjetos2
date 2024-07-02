package org.example.refactoring.segundaFecha.v2.estrategia;

import org.example.refactoring.segundaFecha.v2.Producto;

import java.util.List;

public class Tarjeta extends FormaDePago{
    private static final double ADICIONAL_TARJETA = 1000.0;

    @Override
    public double calcularMontoFinal(List<Producto> productos) {
        return this.calcularMontoProductos(productos) + ADICIONAL_TARJETA;
    }
}
