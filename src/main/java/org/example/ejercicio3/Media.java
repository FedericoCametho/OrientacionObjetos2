package org.example.ejercicio3;

public abstract class Media {

    private String nombre;

    public String getNombre(){
        return this.nombre;
    }
    public Media(String nombre){
        this.nombre = nombre;
    }

    public abstract String play();


}
