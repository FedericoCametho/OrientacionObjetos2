package org.example.ejercicio10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {

    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String objetivo;
    private int integrantes;
    private Double margenGanancia;

    private Double pagoPorDia;

    private Estado estado;

    public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetico, int integrantes, Double pagoPorDia) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.objetivo = objetico;
        this.integrantes = integrantes;
        this.pagoPorDia = pagoPorDia;
        this.margenGanancia = 0.07;
        this.estado = new EnConstruccion();
    }

    public void modificarMargenGanancia(double nuevoMargen){
        this.estado.modificarMargenGanancia(this, nuevoMargen);
    }

    public void aprobarEtapa(){
        if (this.precioDelProyecto() != 0){
            this.estado.aprobarEtapa(this);
        } else {
            throw new RuntimeException("El proyecto tiene precio 0, no puede aprobarse");
        }
    }

    public double costoDelProyecto(){
        return this.integrantes * this.calcularDias() * this.pagoPorDia;
    }

    public double precioDelProyecto(){
        return this.costoDelProyecto() * (1 + this.margenGanancia);
    }

    public void cancelarProyecto(){
        this.estado.cancelarProyecto(this);
    }

    public long calcularDias(){
        return ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin);
    }


    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Double getPagoPorDia() {
        return pagoPorDia;
    }

    public void setPagoPorDia(Double pagoPorDia) {
        this.pagoPorDia = pagoPorDia;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    public Double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(Double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }
}
