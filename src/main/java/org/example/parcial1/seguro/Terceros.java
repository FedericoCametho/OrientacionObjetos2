package org.example.parcial1.seguro;

import org.example.parcial1.Persona;
import org.example.parcial1.Vehiculo;

public class Terceros extends Seguro{


    private Double BASE_SEGURO_DANOS = 1000.00;

    @Override
    public Double coberturaDeVidaExtra(Vehiculo vehiculo, Persona persona) {
        return 0.00;
    }

    @Override
    public Double coberturaDeDanosTerceros(Vehiculo vehiculo, Persona persona) {
        return BASE_SEGURO_DANOS + 0.01 * vehiculo.getValor();
    }

    @Override
    public Double coberturaDanosPropiosExtra(Vehiculo vehiculo) {
        return 0.0;
    }
}
