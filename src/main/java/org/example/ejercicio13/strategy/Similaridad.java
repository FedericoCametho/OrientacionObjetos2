package org.example.ejercicio13.strategy;

import org.example.ejercicio13.Pelicula;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Similaridad extends SugerenciasStrategy{

    @Override
    public Stream<Pelicula> ordenarPeliculasSegunSugerencia(List<Pelicula> peliculasFiltradas, List<Pelicula> reproducidas) {
        Set<Pelicula> similaresDeReproducidas = reproducidas.stream().flatMap(peli -> peli.getSimilares().stream()).collect(Collectors.toSet());
        return peliculasFiltradas.stream().filter(similaresDeReproducidas::contains);
    }



}
