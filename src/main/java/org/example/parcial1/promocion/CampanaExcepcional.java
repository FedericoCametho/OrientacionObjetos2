package org.example.parcial1.promocion;

import org.example.parcial1.Persona;
import org.example.parcial1.Vehiculo;

import java.util.List;

public class CampanaExcepcional implements Promocion{
    @Override
    public Double calcularDescuentoPromo(List<Vehiculo> vehiculos, Persona persona) {
        return vehiculos.stream()
                .mapToDouble(vehiculo -> vehiculo.getSeguro().getImporteTotalSeguro(vehiculo, persona))
                .min().getAsDouble() * 0.5;
    }
}
