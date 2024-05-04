package org.example.ejercicio13.strategy;

import org.example.ejercicio13.Pelicula;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends SugerenciasStrategy{

    @Override
    public List<Pelicula> ordenarPeliculasSegunSugerencia(List<Pelicula> peliculasFiltradas, List<Pelicula> reproducidas) {
        return peliculasFiltradas.stream()
                .sorted(Comparator.comparingInt(Pelicula::getAnoEstreno))
                .collect(Collectors.toList());
    }
}
