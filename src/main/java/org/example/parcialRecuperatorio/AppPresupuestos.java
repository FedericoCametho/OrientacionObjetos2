package org.example.parcialRecuperatorio;

import org.example.parcialRecuperatorio.configuraciones.Config;

import java.time.LocalDate;
import java.util.List;

public class AppPresupuestos {
    List<Presupuesto> presupuestos;
    public Presupuesto crearPresupuesto(String nombreCliente, Config configuracion){
        Presupuesto presupuesto = new Presupuesto(nombreCliente, configuracion, LocalDate.now());
        this.presupuestos.add(presupuesto);
        return presupuesto;
    }

    public double calcularPrecio(Presupuesto presupuesto){
        return presupuesto.calcularPrecio();
    }
}
