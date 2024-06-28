package org.example.refactoring.ejercicio2.cinco.v2;

public class Cliente {

    private Direccion direccion;

    public String getDireccionFormateada() {
        return this.direccion.toString();
    }
}