package org.example.ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public class Novedades extends Sugerencia{


    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador deco) {
        return deco.getPeliculas().stream()
                .sorted((p2, p1) -> p1.getAno().compareTo(p2.getAno())).collect(Collectors.toList());

    }
}
