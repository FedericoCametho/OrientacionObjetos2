package org.example.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MediaPlayer {

    private List<Media> mediaPlaylist;

    public MediaPlayer(){
        this.mediaPlaylist = new ArrayList<Media>();
    }


    public List<Media> getMediaPlaylist(){
        return this.mediaPlaylist;
    }
    public void agregarMediaFile(Media archivo){
        this.mediaPlaylist.add(archivo);
    }
    public List<String> reproducirLista(){
        return this.mediaPlaylist.stream().map(m -> m.play()).collect(Collectors.toList());
    }

}
