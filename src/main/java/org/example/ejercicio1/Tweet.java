package org.example.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tweet {

    private String contenido;
    private LocalDate fecha;
    private List<ReTweet> retweets;

    public Tweet(String mensaje){
        this.contenido = mensaje;
        this.fecha = LocalDate.now();
        this.retweets = new ArrayList<ReTweet>();
    }

    public String getContenido(){
        return this.contenido;
    }


    public LocalDate getFecha(){
        return this.fecha;
    }

    public List<ReTweet> getRetweets(){
        return this.retweets;
    }
    public void setContenido(String cont){
        this.contenido = cont;
    }


    public void eliminarRetweets(){
        if (!this.retweets.isEmpty()){
            this.retweets.forEach( t -> t.borradoLogicoReTweet());
        }
    }

    public void agregarReTweet(ReTweet rt){
        this.retweets.add(rt);
    }



}
