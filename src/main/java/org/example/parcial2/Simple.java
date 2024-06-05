package org.example.parcial2;

import java.time.LocalDateTime;

public class Simple extends Tarea {
    private int duracionEstimada;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    protected Estado state;

    public Simple(String nombre, String desc, int duracionEstimada){
        super(nombre,desc);
        this.duracionEstimada = duracionEstimada;
        this.state = new Esperando();
    }

    public int getDuracionEstimada(){
        return this.duracionEstimada;
    }

    public long getDuracionTotal(){
        return this.state.getDuracionTotal(this.fechaInicio, this.fechaFin);
    }

    @Override
    public double getAvanceTarea() {
        return (double) this.getDuracionTotal() / this.duracionEstimada;
    }

    public void iniciarTarea(){
        this.state.iniciarTarea(this);
        this.fechaInicio = LocalDateTime.now();
    }

    public void finalizarTarea(){
        this.state.finalizarTarea(this);
        this.fechaFin = LocalDateTime.now();
    }

    public LocalDateTime getFechaInicio(){
        return this.fechaInicio;
    }

    public LocalDateTime getFechaFin(){
        return this.fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin){
        this.fechaFin = fechaFin;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setDuracionEstimada(int duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    public Estado getState() {
        return state;
    }

    public void setState(Estado state) {
        this.state = state;
    }
}
