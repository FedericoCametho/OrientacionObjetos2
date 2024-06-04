package org.example.parcial1;

import org.example.parcial1.seguro.Seguro;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vehiculo {

    private Integer cantMaximaOcupantes;
    private Double valor;
    private Seguro seguro;
    private LocalDate fechaFabricacion;

    public Vehiculo(Integer cantMaximaOcupantes, Double valor, Seguro seguro, LocalDate fechaFabricacion) {
        this.cantMaximaOcupantes = cantMaximaOcupantes;
        this.valor = valor;
        this.seguro = seguro;
        this.fechaFabricacion = fechaFabricacion;
    }


    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public long getAntiguedad() {
        return ChronoUnit.YEARS.between(this.fechaFabricacion, LocalDate.now());
    }


    public Integer getCantMaximaOcupantes() {
        return cantMaximaOcupantes;
    }

    public void setCantMaximaOcupantes(Integer cantMaximaOcupantes) {
        this.cantMaximaOcupantes = cantMaximaOcupantes;
    }
}
