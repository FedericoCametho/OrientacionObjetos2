package org.example.ejercicio3;

public class MediaAdapter extends Media{

    private VideoStream videoStream;

    public MediaAdapter(VideoStream videoStream){
        super(videoStream.getNombre());
        this.videoStream = videoStream;
    }

    @Override
    public String play(){
        return  "Nombre del archivo: " + this.getNombre().toUpperCase() + " - " + this.videoStream.reproduce();
    }

}
