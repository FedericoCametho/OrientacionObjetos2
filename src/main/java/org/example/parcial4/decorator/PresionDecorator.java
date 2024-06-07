package org.example.parcial4.decorator;

import org.example.parcial4.AplicacionClima;

public class PresionDecorator extends BaseDecorator {
    public PresionDecorator(DisplayDataInterface wrappee) {
        super(wrappee);
    }

    @Override
    public String displayData(AplicacionClima aplicacionClima) {
        return super.displayData(aplicacionClima) + " - Presion Atmosferica: "+aplicacionClima.getPresionAtmosferica();
    }
}
