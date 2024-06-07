package org.example.parcial4.decorator;

import org.example.parcial4.AplicacionClima;

public class TemperaturaDecorator extends BaseDecorator{
    public TemperaturaDecorator(DisplayDataInterface wrappee) {
        super(wrappee);
    }

    @Override
    public String displayData(AplicacionClima aplicacionClima) {
        return super.displayData(aplicacionClima) + " - Temperatura C: "+aplicacionClima.getTemperaturaEnCelcius();
    }
}
