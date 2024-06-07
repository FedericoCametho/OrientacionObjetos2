package org.example.parcial4;

import org.example.parcial4.decorator.*;

import java.util.List;

public class AplicacionClima {

    private HomeWeatherAdapter homeWheatherStationAdapter;
    private DisplayDataInterface displayDataComponent;

    public AplicacionClima(HomeWeatherAdapter homeWheatherStationAdapter) {
        this.homeWheatherStationAdapter = homeWheatherStationAdapter;
        this.displayDataComponent = new InfoConcreta();
    }

    public double getPromedioHistoricoC(){
        List<Double> temperaturasList =  this.homeWheatherStationAdapter.getHistoricosEnFH();
        return temperaturasList.stream().mapToDouble(this::convertirFHaC).sum() / temperaturasList.size();
    }
    public double getTemperaturaEnCelcius(){
        return this.convertirFHaC(this.homeWheatherStationAdapter.getTemperaturaFH());
    }
    public double getRadiacionSolar(){
        return this.homeWheatherStationAdapter.getRadiacionSolar();
    }
    public double getPresionAtmosferica(){
        return this.homeWheatherStationAdapter.getPresionAtmosferica();
    }
    private double convertirFHaC(double fh){
        return (fh-32)/1.8;
    }

    public String displayData(){
        return this.displayDataComponent.displayData(this);
    }

    public void setConfigDisplayTemperatura(){
        this.displayDataComponent = new TemperaturaDecorator(this.displayDataComponent);
    }
    public void setConfigDisplayPresion(){
        this.displayDataComponent = new PresionDecorator(this.displayDataComponent);
    }
    public void setConfigDisplayRadiacion(){
        this.displayDataComponent = new RadiacionSolarDecorator(this.displayDataComponent);
    }
    public void setConfigDisplayPromedioTemperaturas(){
        this.displayDataComponent = new PromedioTemperaturasDecorator(this.displayDataComponent);
    }

    public void resetConfigs(){
        this.displayDataComponent = new InfoConcreta();
    }

}
