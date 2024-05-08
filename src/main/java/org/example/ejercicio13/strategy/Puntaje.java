package org.example.ejercicio13.strategy;

import org.example.ejercicio13.Pelicula;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Puntaje extends SugerenciasStrategy{


    @Override
    public Stream<Pelicula> ordenarPeliculasSegunSugerencia(List<Pelicula> peliculasFiltradas, List<Pelicula> reproducidas) {
        return peliculasFiltradas.stream()
                .sorted(Comparator.comparingDouble(Pelicula::getPuntaje).reversed());
    }
}
