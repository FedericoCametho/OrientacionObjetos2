package org.example.parcial3;

import org.example.parcial3.estadoExcursion.Completa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

public class ExcursionTest {

    private Persona p1Inscripta;
    private Persona p2Inscripta;
    private Excursion kayak;
    private Persona p3;

    @BeforeEach
    public void setUp(){
        this.p1Inscripta = new Persona("Fede","Cametho", "fede@gmail.com");
        this.p2Inscripta = new Persona("Tobi", "Buche", "tobi@hotmail.com");
        this.p3 = new Persona("Burneishon", "Pesta", "bruno@gmail.com");

        this.kayak = new Excursion("Dos dias kayak", LocalDate.of(2024,10,10), LocalDate.of(2024,10,11), "Parana", 100.00, 1, 2);
    }

    @Test
    public void agregarPersonaAExcursionTest(){
        System.out.println(this.kayak.obtenerInformacion());
        this.kayak.agregarUnaPersonaALaExcursion(this.p1Inscripta);
        System.out.println(this.kayak.obtenerInformacion());
        this.kayak.agregarUnaPersonaALaExcursion(this.p2Inscripta);
        this.kayak.agregarUnaPersonaALaExcursion(this.p3);

        Assertions.assertEquals(this.kayak.getListaEspera().size(), 1);
        Assertions.assertEquals(this.kayak.getListaEspera().get(0), this.p3);
        Assertions.assertEquals(this.kayak.getPersonaList().size(), 2);

        Assertions.assertEquals(this.kayak.getEstado().getClass(), Completa.class);
        System.out.println(this.kayak.obtenerInformacion());
    }



}
