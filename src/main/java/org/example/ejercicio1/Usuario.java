package org.example.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String username;

    private List<Tweet> listaTweet;

    public Usuario(String username){
        this.username = username;
        this.listaTweet = new ArrayList<Tweet>();
    }


    public String getUsername() {
        return username;
    }

    public List<Tweet> getListaTweet() {
        return listaTweet;
    }



    public void agregarNuevoTweet(String contenido){
        if(contenido != null && !contenido.isEmpty() && contenido.length() < 280) {
            Tweet t = new Tweet(contenido);
            this.listaTweet.add(t);
        }
    }

    public void reTweetear (String contenido, Tweet original){
        ReTweet t = new ReTweet(contenido, original);
        original.agregarReTweet(t);
        this.listaTweet.add(t);
    }

    public void borrarTweets(){
        this.listaTweet.forEach(t -> t.eliminarRetweets());
        this.listaTweet.clear();
    }

}
