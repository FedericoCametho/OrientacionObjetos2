package org.example.parcial1.promocion;

import org.example.parcial1.Persona;
import org.example.parcial1.Vehiculo;

import java.util.List;

public class SinPromocion implements Promocion{
    @Override
    public Double calcularDescuentoPromo(List<Vehiculo> vehiculos, Persona persona) {
        return 0.0;
    }
}
