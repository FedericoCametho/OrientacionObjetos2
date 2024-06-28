package org.example.refactoring.parcialPrimeraFecha.v1;

import java.util.List;

public class Pedido {
    private List<Material> materiales;
    private double costoEnvio;

    public Pedido(List<Material> maeriales, double costoEnvio){
        this.materiales = maeriales;
        this.costoEnvio = costoEnvio;
    }

    public List<Material> getMateriales(){
        return this.materiales;
    }

    public double getCostoEnvio(){
        return this.costoEnvio;
    }

}
