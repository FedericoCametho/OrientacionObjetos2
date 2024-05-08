package org.example.ejercicio13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pelicula {
    private String titulo;
    private Integer anoEstreno;
    private Set<Pelicula> similares;
    private Double puntaje;

    public Pelicula(String titulo,Double puntaje,  Integer anoEstreno) {
        this.titulo = titulo;
        this.anoEstreno = anoEstreno;
        this.similares = new HashSet<>();
        this.puntaje = puntaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoEstreno() {
        return anoEstreno;
    }

    public void setAnoEstreno(Integer anoEstreno) {
        this.anoEstreno = anoEstreno;
    }

    public Set<Pelicula> getSimilares() {
        return similares;
    }

    public void setSimilares(Set<Pelicula> similares) {
        this.similares = similares;
        similares.forEach(peli -> peli.agregarSimilar(this));
    }
    public void agregarSimilar(Pelicula peli){
        if(!this.similares.contains(peli)){
            this.similares.add(peli);
        }
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }
}
