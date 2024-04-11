package org.example.ejercicio3;

public class Audio extends Media{

    public Audio(String nombre){
        super(nombre);
    }
    @Override
    public String play(){
        return "Nombre del archivo: " + this.getNombre().toUpperCase() + " - Soy un archivo de audio y estoy reproduciendome porque le dieron play";
    }
}
