package org.example.parcial4.decorator;

import org.example.parcial4.AplicacionClima;

public class PromedioTemperaturasDecorator extends BaseDecorator{
    public PromedioTemperaturasDecorator(DisplayDataInterface wrappee) {
        super(wrappee);
    }

    @Override
    public String displayData(AplicacionClima aplicacionClima) {
        return super.displayData(aplicacionClima) + " - Promedio Temperaturas C: "+aplicacionClima.getPromedioHistoricoC();
    }
}
