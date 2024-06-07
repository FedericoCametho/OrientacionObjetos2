package org.example.parcial4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AplicacionClimaTest {

    private AplicacionClima aplicacionClima;
    private HomeWeatherAdapter homeWeatherAdapter;
    private HomeWeatherStation  homeWeatherStation;

    @BeforeEach
    void setUp(){
        this.homeWeatherStation = new HomeWeatherStation();
        this.homeWeatherAdapter = new HomeWeatherAdapter(this.homeWeatherStation);
        this.aplicacionClima = new AplicacionClima(this.homeWeatherAdapter);
    }

    @AfterEach
    void reset(){
        this.aplicacionClima.resetConfigs();
    }

    @Test
    public void displayDataTestEjemplo1(){
        this.aplicacionClima.setConfigDisplayPresion();
        System.out.println(this.aplicacionClima.displayData());
    }
    @Test
    public void displayDataTestEjemplo2(){
        this.aplicacionClima.setConfigDisplayPresion();
        this.aplicacionClima.setConfigDisplayRadiacion();
        System.out.println(this.aplicacionClima.displayData());
    }


    @Test
    public void displayDataTestEjemplo3(){
        this.aplicacionClima.setConfigDisplayRadiacion();
        this.aplicacionClima.setConfigDisplayTemperatura();
        this.aplicacionClima.setConfigDisplayPromedioTemperaturas();

        System.out.println(this.aplicacionClima.displayData());
    }
}
