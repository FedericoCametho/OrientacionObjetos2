package org.example.ejercicio13;

import org.example.ejercicio13.strategy.Puntaje;
import org.example.ejercicio13.strategy.Similaridad;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class DecodificadorTest {

    private Decodificador decodificador;
    private Pelicula thor = new Pelicula("Thor", 7.9, 2007);

    private Pelicula capitanAmerica = new Pelicula("Capitan America", 7.8, 2016);
    private Pelicula ironMan = new Pelicula("Iron man", 7.9, 2010);
    private Pelicula dunkirk = new Pelicula("Dunkirk", 7.9, 2017);
    private Pelicula rocky = new Pelicula("Rocky", 8.1, 1976);
    private Pelicula rambo = new Pelicula("Rambo", 7.8, 1979);

    @BeforeAll
    public void setUp() {
        this.decodificador = new Decodificador();
        this.decodificador.addMovidesToGrid(Arrays.asList(this.thor, this.capitanAmerica, this.ironMan, this.dunkirk, this.rocky, this.rambo));
        this.decodificador.addMovieToReproducedList(this.thor);
        this.decodificador.addMovieToReproducedList(this.rocky);

        this.thor.setSimilares(Set.of(this.capitanAmerica, this.ironMan));
        this.capitanAmerica.setSimilares(Set.of(this.thor, this.ironMan));
        this.ironMan.setSimilares(Set.of(this.thor, this.capitanAmerica));
        this.rocky.setSimilares(Set.of(this.rambo));
        this.rambo.setSimilares(Set.of(this.rocky));
    }


    @Test
    public void decoTestSimilaridad(){
        this.decodificador.setSugerenciasStrategy(new Similaridad());
        List<Pelicula> sugerenciaSimilaridad = this.decodificador.sugererirPeliculas();
        Assertions.assertNotNull(sugerenciaSimilaridad);
    }


    @Test
    public void decoTestPuntaje(){
        this.decodificador.setSugerenciasStrategy(new Puntaje());
        List<Pelicula> sugerenciaSimilaridad = this.decodificador.sugererirPeliculas();
        Assertions.assertNotNull(sugerenciaSimilaridad);
    }
}


