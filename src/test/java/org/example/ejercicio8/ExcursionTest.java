package org.example.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;
/*
Escriba un test para inscribir a un usuario en la excursión “Dos días en kayak bajando el Paraná”,
con cupo mínimo de 1 persona y cupo máximo 2, con dos personas ya inscriptas.
Implemente todos los mensajes que considere necesarios.
 */

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
    private Excursion excursion;
    private Usuario usuario1;
    private Usuario usuario2;
    private Usuario usuario3;

    @BeforeEach
    public void setUp() throws Exception {
        this.excursion = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2023, 4, 6), LocalDate.of(2023, 4, 8),
                "Terminal de Ómnibus de La Plata", 5000.0,1,2);
        this.usuario1 = new Usuario("Lana", "Del Rey", "lanadelrey1985@gmail.com");
        this.usuario2 = new Usuario("Taylor", "Swift", "taylorswift13@gmail.com");
        this.usuario3 = new Usuario("Lily", "Rabe", "lilyrabe82@gmail.com");
        System.out.println(this.excursion.mostrarInformacion()); //queria ver como imprimia je
        this.excursion.agregarInscripcion(usuario1);
        System.out.println(this.excursion.mostrarInformacion());
        this.excursion.agregarInscripcion(usuario2);
        System.out.println(this.excursion.mostrarInformacion());
    }

    @Test
    public void testInscribir() {
        this.excursion.agregarInscripcion(usuario3);
        assertEquals(1,this.excursion.getListaDeEspera().size());
        assertEquals(2,this.excursion.getPasajerosConfirmados().size());
        assertTrue(this.excursion.getPasajerosConfirmados().contains(usuario1));
        assertTrue(this.excursion.getPasajerosConfirmados().contains(usuario2));
        assertFalse(this.excursion.getPasajerosConfirmados().contains(usuario3));
        assertTrue(this.excursion.getListaDeEspera().contains(usuario3));
        assertTrue(this.excursion.getState() instanceof Completa);
    }

}