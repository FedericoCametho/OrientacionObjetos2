package org.example.parcial5.state;

import org.example.parcial5.Proyecto;

import java.time.LocalDate;

public class AplicacionDeGestion {

    public Proyecto crearProyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo, Double margenGanancia, Integer cantIntegrantes, Double pagoPorIntegrante){
        return new Proyecto(nombre, fechaInicio, fechaFin, objetivo, margenGanancia, cantIntegrantes, pagoPorIntegrante);
    }

    public void aprobarEtapa(Proyecto proyecto){
        proyecto.aprobarEtapa();
    }
}
