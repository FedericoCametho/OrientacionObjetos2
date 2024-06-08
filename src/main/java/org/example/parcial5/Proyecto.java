package org.example.parcial5;

import org.example.parcial5.state.EnConstruccion;
import org.example.parcial5.state.Estado;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String objetivo;
    private Integer integrantes;
    private Double margenGanancia;
    private Estado estado;
    private Double tarifaPorDiaPorIntegrante;

    public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo, Double margenGanancia, Integer integrantes, Double tarifaPorDiaPorIntegrante) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.objetivo = objetivo;
        this.integrantes = integrantes;
        this.margenGanancia = margenGanancia;
        this.estado = new EnConstruccion();
        this.tarifaPorDiaPorIntegrante = tarifaPorDiaPorIntegrante;
    }

    public void aprobarEtapa(){
        this.estado.aprobarEtapa(this);
    }


    public Double calcularPrecioProyecto(){
        return this.calcularCosto() * (1+this.margenGanancia);
    }
    private Double calcularCosto(){
        return this.integrantes * tarifaPorDiaPorIntegrante * this.calcularDiasProyecto();
    }
    private long calcularDiasProyecto(){
        return  ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin);
    }
    public void modificarMargenGanancia(double nuevoMargen){
        this.estado.modificarMargenGanancia(this, nuevoMargen);
    }
    public void cancelarProyecto(){
        this.estado.cancelarProyecto(this);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    public void setMargenGanancia(Double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
