package org.example.parcial5;

import org.example.parcial5.state.AplicacionDeGestion;
import org.example.parcial5.state.Cancelado;
import org.example.parcial5.state.Confirmado;
import org.example.parcial5.state.EnEvaluacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AplicacionDeGestionProyectosTest {
    private AplicacionDeGestion aplicacionDeGestion;
    private Proyecto proyecto;

    @BeforeEach
    public void setUp(){
        this.aplicacionDeGestion = new AplicacionDeGestion();

        this.proyecto = this.aplicacionDeGestion.crearProyecto("Vacaciones de invierno", LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 11),
                "salir con amigos",0.10, 3, 10.00);


    }

    @Test
    public void aprobarProyectoEnEvaluacionTest(){
        this.proyecto.setEstado(new EnEvaluacion());

        this.proyecto.aprobarEtapa();

        Assertions.assertEquals(this.proyecto.getEstado().getClass(), Confirmado.class);
    }
    @Test
    public void aprobarProyectoEnConstruccionTest(){
        this.proyecto.aprobarEtapa();

        Assertions.assertEquals(this.proyecto.getEstado().getClass(), EnEvaluacion.class);
    }
    @Test
    public void aprobarProyectoConfirmadoTest(){
        this.proyecto.setEstado(new Confirmado());
        this.proyecto.aprobarEtapa();

        Assertions.assertEquals(this.proyecto.getEstado().getClass(), Confirmado.class);
    }
    @Test
    public void aprobarProyectoEnCanceladoTest(){
        this.proyecto.cancelarProyecto();
        this.proyecto.aprobarEtapa();

        Assertions.assertEquals(this.proyecto.getEstado().getClass(), Cancelado.class);
    }
}
