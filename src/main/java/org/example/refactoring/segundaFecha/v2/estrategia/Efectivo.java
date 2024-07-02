package org.example.refactoring.segundaFecha.v2.estrategia;

import org.example.refactoring.segundaFecha.v2.Producto;

import java.util.List;

public class Efectivo extends FormaDePago{
    private static final double DESCUENTO_EFECTIVO = 2000.0;
    private static final double PISO_APLICA_DESCUENTO = 100000;
    @Override
    public double calcularMontoFinal(List<Producto> productos) {
        double montoProductos = this.calcularMontoProductos(productos);
        return (montoProductos > PISO_APLICA_DESCUENTO)
                ? montoProductos - DESCUENTO_EFECTIVO
                : montoProductos;
    }
}
