package org.example.refactoring.segundaFecha.v2;

import org.example.refactoring.segundaFecha.v2.estrategia.FormaDePago;

import java.util.List;

public class Pago {
    private List<Producto> productos;
    private FormaDePago formaDePago;


    public Pago(FormaDePago formaDePago, List<Producto> productos){
        this.productos = productos;
        this.formaDePago = formaDePago;
    }

    protected double calcularMontoFinal(){
        return this.formaDePago.calcularMontoFinal(this.productos);
    }
}
