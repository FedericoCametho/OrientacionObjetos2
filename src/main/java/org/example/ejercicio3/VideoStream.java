package org.example.ejercicio3;

public class VideoStream {

    private String nombre;
    public VideoStream(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String reproduce(){
        return "Soy un Video Streaming que se esta reproduciendo porque me dieron reproduce";
    }
}
