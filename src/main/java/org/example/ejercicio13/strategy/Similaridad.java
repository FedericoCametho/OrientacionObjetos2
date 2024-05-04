package org.example.ejercicio13.strategy;

import org.example.ejercicio13.Pelicula;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Similaridad extends SugerenciasStrategy{

    @Override
    public List<Pelicula> ordenarPeliculasSegunSugerencia(List<Pelicula> peliculasFiltradas, List<Pelicula> reproducidas) {
        Set<Pelicula> similaresDeReproducidas = reproducidas.stream().flatMap(peli -> peli.getSimilares().stream()).collect(Collectors.toSet());
        return peliculasFiltradas.stream().filter(peli -> this.tieneSimilitud(peli, similaresDeReproducidas)).collect(Collectors.toList());
    }

    public boolean tieneSimilitud(Pelicula pelicula, Set<Pelicula> peliSimilares){
        return pelicula.getSimilares().stream().anyMatch(peliSimilares::contains);
    }

}
