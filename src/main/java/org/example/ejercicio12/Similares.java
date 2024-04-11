package org.example.ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public class Similares extends Sugerencia{
    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador deco) {
        return  deco.getReproducidas().stream().map( p -> p.getSimilares())
                .flatMap( lista -> lista.stream().distinct()).collect(Collectors.toList());
    }

}
