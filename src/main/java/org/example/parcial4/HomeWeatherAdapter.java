package org.example.parcial4;

import java.util.List;

public class HomeWeatherAdapter {
    private HomeWeatherStation homeWeatherStation;

    public HomeWeatherAdapter(HomeWeatherStation homeWeatherStation) {
        this.homeWeatherStation = homeWeatherStation;
    }

    public List<Double> getHistoricosEnFH(){
        return this.homeWeatherStation.getTemperaturasFarenheit();
    }

    public double getTemperaturaFH(){
        return this.homeWeatherStation.getTemperaturaFarenheit();
    }
    public double getRadiacionSolar(){
        return this.homeWeatherStation.getRadiacionSolar();
    }
    public double getPresionAtmosferica(){
        return this.homeWeatherStation.getPresion();
    }
}
