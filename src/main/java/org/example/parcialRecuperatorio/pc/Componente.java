package org.example.parcialRecuperatorio.pc;

public class Componente {
    private String nombre;
    private String descripcion;
    private double precio;
    private double consumo;

    public String getDescripcion(){
        return this.descripcion;
    }

    public double getConsumo(){
        return this.consumo;
    }
    public double getPrecio(){
        return this.precio;
    }

}
