package org.example.parcialRecuperatorio;

import org.example.parcialRecuperatorio.pc.Equipo;
import org.example.parcialRecuperatorio.configuraciones.Config;

import java.time.LocalDate;

public class Presupuesto {
    private String nombreCliente;
    private LocalDate fecha;
    private Config configuracion;
    private Equipo equipo;

    public Presupuesto(String nombreCliente, Config configuracion, LocalDate fecha) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.configuracion = configuracion;
        this.equipo = this.configuracion.crearEquipo();
    }

    public double calcularPrecio(){
        return this.equipo.calcularPrecio();
    }
}
