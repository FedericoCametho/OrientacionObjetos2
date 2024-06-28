package org.example.refactoring.parcialPrimeraFecha.v2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private static final double PRECIO_REFERENCIA_PUNTOS = 1000;
    private String nombre;
    private List<Pedido> pedidos;
    private double puntos;

    public Cliente(String nombre){
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
        this.puntos = 0.0;
    }

    public void agregarPedido(List<Material> materiales, double costoEnvio){
        Pedido pedido = new Pedido(materiales, costoEnvio);
        this.pedidos.add(pedido);
        this.sumarPuntos(pedido);
    }

    private void sumarPuntos(Pedido pedido){
        if(pedido.getPrecioTotal() > PRECIO_REFERENCIA_PUNTOS){
            this.puntos += pedido.calcularPuntosASumar();
        }
    }





}
