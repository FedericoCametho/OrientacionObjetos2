package org.example.parcial4.decorator;

import org.example.parcial4.AplicacionClima;

public class InfoConcreta implements DisplayDataInterface{
    @Override
    public String displayData(AplicacionClima aplicacionClima){
        return "Informacion a Mostrar: ";
    }


}
