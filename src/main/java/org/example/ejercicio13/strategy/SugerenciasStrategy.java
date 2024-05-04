package org.example.ejercicio13.strategy;

import org.example.ejercicio13.Pelicula;

import java.util.List;
import java.util.stream.Collectors;

public abstract class SugerenciasStrategy {

    public List<Pelicula> obtenerSugerencias(List<Pelicula> grillaCompleta, List<Pelicula> reproducidas){
        return this.ordenarPeliculasSegunSugerencia(
                grillaCompleta.stream().filter(peli -> !reproducidas.contains(peli))
                        .limit(3).collect(Collectors.toList()), reproducidas);
    }

    public abstract List<Pelicula> ordenarPeliculasSegunSugerencia(List<Pelicula> peliculasFiltradas, List<Pelicula> reproducidas);

}
