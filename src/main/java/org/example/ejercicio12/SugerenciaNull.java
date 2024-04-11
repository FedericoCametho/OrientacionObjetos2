package org.example.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class SugerenciaNull extends Sugerencia{

    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador deco) {
        return new ArrayList<Pelicula>();
    }
}
