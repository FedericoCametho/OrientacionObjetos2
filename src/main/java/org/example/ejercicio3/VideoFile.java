package org.example.ejercicio3;

public class VideoFile extends Media{

    public VideoFile(String nombre){
        super(nombre);
    }
    @Override
    public String play() {
        return "Nombre del archivo: " + this.getNombre().toUpperCase() + " - Soy un archivo de Video y estoy reproduciendome porque me dieron play";
    }
}
