package org.example.parcial1.seguro;

import org.example.parcial1.Persona;
import org.example.parcial1.Vehiculo;

public class TodoRiesgo extends Seguro{
    private Double BASE_SEGURO_VIDA = 9000.00;
    private Double BASE_SEGURO_DANOS = 100000.00;
    private Double BASE_SEGURO_DANOS_PROPIOS = 1000.00;
    @Override
    public Double coberturaDeVidaExtra(Vehiculo vehiculo, Persona persona) {
        return BASE_SEGURO_VIDA * vehiculo.getAntiguedad();
    }

    @Override
    public Double coberturaDeDanosTerceros(Vehiculo vehiculo, Persona persona) {
        return BASE_SEGURO_DANOS / persona.getEdad();
    }

    @Override
    public Double coberturaDanosPropiosExtra(Vehiculo vehiculo) {
        return BASE_SEGURO_DANOS_PROPIOS * vehiculo.getAntiguedad();
    }
}
