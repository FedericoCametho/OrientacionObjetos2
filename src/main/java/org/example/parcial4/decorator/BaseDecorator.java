package org.example.parcial4.decorator;

import org.example.parcial4.AplicacionClima;

public abstract class BaseDecorator implements DisplayDataInterface {
    private DisplayDataInterface wrappee;

    public BaseDecorator(DisplayDataInterface wrappee){
        this.wrappee = wrappee;
    }


    public String displayData(AplicacionClima aplicacionClima){
        return this.wrappee.displayData(aplicacionClima);
    }

}
