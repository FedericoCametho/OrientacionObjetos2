package org.example.refactoring.segundaFecha.v1;

import org.example.parcial5.Proyecto;

import java.util.List;

public class Pago {
    private List<Producto> productos;
    private String tipo;
    private static final double ADICIONAL_TARJETA = 1000.0;
    private static final double DESCUENTO_EFECTIVO = 2000.0;

    public Pago(String tipo, List<Producto> productos){
        this.productos = productos;
        this.tipo = tipo;
    }

    public double calcularMontoFinal(){
        double total = 0.0;
        if (this.tipo.equals("EFECTIVO")){
            for (Producto producto : this.productos){
                total = total + producto.getPrecio() + (producto.getPrecio() * producto.getIVA());
            }
            if (total > 100000){
                total = total - DESCUENTO_EFECTIVO;
            }
        }
        else if(this.tipo.equals("TARJETA")){
            for (Producto producto : this.productos){
                total = total + producto.getPrecio() + (producto.getPrecio() * producto.getIVA());
            }
            total = total + ADICIONAL_TARJETA;
        }
        return total;
    }
}
