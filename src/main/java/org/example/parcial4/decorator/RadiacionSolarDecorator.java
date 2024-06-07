package org.example.parcial4.decorator;

import org.example.parcial4.AplicacionClima;

public class RadiacionSolarDecorator extends BaseDecorator{
    public RadiacionSolarDecorator(DisplayDataInterface wrappee) {
        super(wrappee);
    }

    @Override
    public String displayData(AplicacionClima aplicacionClima) {
        return super.displayData(aplicacionClima) + " - Radiacion Solar: "+aplicacionClima.getRadiacionSolar();
    }
}
