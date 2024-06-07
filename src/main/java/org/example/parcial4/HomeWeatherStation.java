package org.example.parcial4;

import java.util.Arrays;
import java.util.List;

public class HomeWeatherStation {
    public double getTemperaturaFarenheit(){
        return 95.00;
    } // Celcius 35

    public double getPresion(){
        return 1008.0;
    }
    public double getRadiacionSolar(){
        return 500.00;
    }

    public List<Double> getTemperaturasFarenheit(){
        return Arrays.asList(90.00,85.00,100.00,80.00,95.00);
    }             // 32.22 29.44 37.78 26.66 35
}
