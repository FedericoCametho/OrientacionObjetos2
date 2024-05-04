package org.example.ejercicio13;

import org.example.ejercicio13.strategy.SugerenciasStrategy;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
    private List<Pelicula> grillaCompleta = new ArrayList<>();
    private List<Pelicula> peliculasReproducidas = new ArrayList<>();

    private SugerenciasStrategy sugerenciasStrategy = null;

    public void setSugerenciasStrategy(SugerenciasStrategy strategy){
        this.sugerenciasStrategy = strategy;
    }
    public void addMovidesToGrid(List<Pelicula> peliculas){
        this.grillaCompleta.addAll(peliculas);
    }

    public void addMovieToReproducedList(Pelicula peli){
        this.peliculasReproducidas.add(peli);
    }

    public List<Pelicula> sugererirPeliculas(){
        return this.sugerenciasStrategy.obtenerSugerencias(grillaCompleta, peliculasReproducidas);
    }
}
