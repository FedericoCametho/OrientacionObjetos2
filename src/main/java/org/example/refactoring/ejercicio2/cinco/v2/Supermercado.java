package org.example.refactoring.ejercicio2.cinco.v2;

import java.text.MessageFormat;

public class Supermercado {
    public void notificarPedido(long nroPedido, Cliente cliente) {
        String notificacion = String.format("Estimado cliente, se le informa que hemos recibido su pedido con número %l, el cual será enviado a la dirección %s",
                 nroPedido, cliente.getDireccionFormateada());

        // lo imprimimos en pantalla, podría ser un mail, SMS, etc..
        System.out.println(notificacion);
    }
}

