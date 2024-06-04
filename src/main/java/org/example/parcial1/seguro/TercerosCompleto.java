package org.example.parcial1.seguro;

import org.example.parcial1.Persona;
import org.example.parcial1.Vehiculo;

public class TercerosCompleto extends Seguro{

    private Double BASE_SEGURO_VIDA = 5000.00;
    private Double BASE_SEGURO_DANOS_MAYOR_4_ANOS = 4000.00;
    private Double BASE_SEGURO_DANOS_MENOR_4_ANOS = 10000.00;
    private Double BASE_SEGURO_DANOS_PROPIOS = 10000.00;

    @Override
    public Double coberturaDeVidaExtra(Vehiculo vehiculo, Persona persona) {
        return BASE_SEGURO_VIDA * vehiculo.getCantMaximaOcupantes();
    }

    @Override
    public Double coberturaDeDanosTerceros(Vehiculo vehiculo, Persona persona) {
        return (vehiculo.getAntiguedad() > 4)
                ? BASE_SEGURO_DANOS_MAYOR_4_ANOS * vehiculo.getAntiguedad()
                : BASE_SEGURO_DANOS_MENOR_4_ANOS;
    }

    @Override
    public Double coberturaDanosPropiosExtra(Vehiculo vehiculo) {
        return BASE_SEGURO_DANOS_PROPIOS;
    }
}
