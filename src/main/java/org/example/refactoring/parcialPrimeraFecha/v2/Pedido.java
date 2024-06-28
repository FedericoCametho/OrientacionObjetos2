package org.example.refactoring.parcialPrimeraFecha.v2;

import java.util.List;

public class Pedido {
    private List<Material> materiales;
    private double costoEnvio;

    public Pedido(List<Material> maeriales, double costoEnvio){
        this.materiales = maeriales;
        this.costoEnvio = costoEnvio;
    }
    private double getSubtotal() {
        return this.materiales.stream().mapToDouble(Material::calcularPrecio).sum();
    }

    public double getPrecioTotal(){
        return this.getSubtotal() + this.costoEnvio;
    }
    public double calcularPuntosASumar(){
        return  this.getSubtotal() + this.costoEnvio * this.materiales.size();
    }

}
