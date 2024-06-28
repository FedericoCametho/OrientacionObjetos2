package org.example.refactoring.parcialPrimeraFecha.v1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Pedido> pedidos;
    private double puntos;

    public Cliente(String nombre){
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
        this.puntos = 0.0;
    }

    public void armarPedido(List<Material> materiales, double costoEnvio){
        Pedido pedido = new Pedido(materiales, costoEnvio);
        this.pedidos.add(pedido);
        double subtotal = pedido.getMateriales().stream().mapToDouble(m -> m.getPrecio() * m.getCantidad()).sum();
        int cantMateriales = pedido.getMateriales().size();
        if(subtotal + pedido.getCostoEnvio() > 1000){
            this.puntos = this.puntos + subtotal + pedido.getCostoEnvio() * cantMateriales;
        }
    }

}
