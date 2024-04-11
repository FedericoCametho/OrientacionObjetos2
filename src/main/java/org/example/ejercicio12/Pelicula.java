package org.example.ejercicio12;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {

    private String titulo;
    private Year ano;
    private List<Pelicula> similares;
    private Double puntaje;

    public Pelicula(String titulo,Double puntaje, Year ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.similares = new ArrayList<Pelicula>();
        this.puntaje = puntaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public Year getAno() {
        return ano;
    }

    public List<Pelicula> getSimilares() {
        return similares;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void establecerSimilitud(Pelicula peli){
        this.similares.add(peli);
    }
}
