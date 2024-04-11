package org.example.ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Sugerencia {

    public List<Pelicula> getRecomendaciones(Decodificador deco){
        return this.sugerirPeliculas(deco).stream()
                .filter(peli -> !deco.getReproducidas().contains(peli))
                .limit(3).collect(Collectors.toList());
    }

    public abstract List<Pelicula> sugerirPeliculas(Decodificador deco);



}
