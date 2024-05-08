package org.example.ejercicio13.strategy;

import org.example.ejercicio13.Pelicula;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class SugerenciasStrategy {

    public List<Pelicula> obtenerSugerencias(List<Pelicula> grillaCompleta, List<Pelicula> reproducidas){
        return this.ordenarPeliculasSegunSugerencia(this.filtrarPeliculasReproducidas(grillaCompleta,reproducidas), reproducidas).limit(3).collect(Collectors.toList());
    }

    public List<Pelicula> filtrarPeliculasReproducidas(List<Pelicula> grillaCompleta, List<Pelicula> reproducidas){
        return grillaCompleta.stream().filter(peli -> !reproducidas.contains(peli))
                .collect(Collectors.toList());
    }
    public abstract Stream<Pelicula> ordenarPeliculasSegunSugerencia(List<Pelicula> peliculasFiltradas, List<Pelicula> reproducidas);

}
