package org.example.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Year;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodificadorTest {
    private Decodificador decodificador;
    private Pelicula thor;
    private Pelicula capitanAmerica;
    private Pelicula ironMan;
    private Pelicula dunkirk;
    private Pelicula rocky;
    private Pelicula rambo;


    @BeforeEach
    void setUp() throws Exception {
        this.thor = new Pelicula("Thor", 7.9, Year.of(2007));
        this.capitanAmerica = new Pelicula("Capitan America", 7.8, Year.of(2016));
        this.ironMan = new Pelicula("Iron man", 7.9, Year.of(2010));
        this.dunkirk = new Pelicula("Dunkirk", 7.9, Year.of(2017));
        this.rocky = new Pelicula("Rocky", 8.1, Year.of(1976));
        this.rambo = new Pelicula("Rambo", 7.8, Year.of(1979));

        this.thor.establecerSimilitud(capitanAmerica);
        this.thor.establecerSimilitud(ironMan);
        this.capitanAmerica.establecerSimilitud(ironMan);
        this.rocky.establecerSimilitud(rambo);

        this.decodificador = new Decodificador();

        this.decodificador.agregarAGrilla(thor);
        this.decodificador.agregarAGrilla(capitanAmerica);
        this.decodificador.agregarAGrilla(ironMan);
        this.decodificador.agregarAGrilla(dunkirk);
        this.decodificador.agregarAGrilla(rocky);
        this.decodificador.agregarAGrilla(rambo);
        this.decodificador.agregarReproducida(thor);
        this.decodificador.agregarReproducida(rocky);
    }

    @Test
    void testObtenerSugerencias() {
        assertTrue(this.decodificador.getRecomendaciones().isEmpty());
        this.decodificador.setSugerencia(new Novedades());
        assertTrue(this.decodificador.getRecomendaciones().contains(dunkirk));
        assertTrue(this.decodificador.getRecomendaciones().contains(capitanAmerica));
        assertTrue(this.decodificador.getRecomendaciones().contains(ironMan));
        this.decodificador.setSugerencia(new Similares());
        assertTrue(this.decodificador.getRecomendaciones().contains(capitanAmerica));
        assertTrue(this.decodificador.getRecomendaciones().contains(ironMan));
        assertTrue(this.decodificador.getRecomendaciones().contains(rambo));
        this.decodificador.setSugerencia(new Puntaje());
        assertTrue(this.decodificador.getRecomendaciones().contains(capitanAmerica));
        assertTrue(this.decodificador.getRecomendaciones().contains(ironMan));
        assertTrue(this.decodificador.getRecomendaciones().contains(dunkirk));
    }

}