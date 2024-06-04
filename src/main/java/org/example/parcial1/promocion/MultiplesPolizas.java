package org.example.parcial1.promocion;

import org.example.parcial1.Persona;
import org.example.parcial1.Vehiculo;

import java.util.List;

public class MultiplesPolizas implements Promocion{
    @Override
    public Double calcularDescuentoPromo(List<Vehiculo> vehiculos, Persona persona) {
        return (vehiculos.size() > 1) ? this.calcularDescuento(vehiculos, persona) : 0;
    }

    private Double calcularDescuento(List<Vehiculo> vehiculos, Persona persona){
        return vehiculos.stream().mapToDouble(vehiculo -> vehiculo.getSeguro().getImporteTotalSeguro(vehiculo, persona)).sum() * 0.10;
    }
}
