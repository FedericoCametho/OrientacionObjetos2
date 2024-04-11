package org.example.ejercicio11;

public class Dispositivo {
    private CRC_Calculator crcCalculator;
    private Connection connection;
    private Ringer ringer;
    private Display display;

    public Dispositivo(CRC_Calculator calculator, Connection connection, Ringer ringer, Display display) {
        this.crcCalculator = calculator;
        this.connection = connection;
        this.ringer = ringer;
        this.display = display;
    }

    public String send(String data){
        long crc = this.crcCalculator.crcFor(data);
        return this.connection.sendData(data, crc);
    }

    public void cambiarConexion(Connection nuevaConexion){
        this.connection = nuevaConexion;
        this.display.showBanner(this.connection.pict());
        this.ringer.ring();
    }

    public void cambiarCalculator(CRC_Calculator nuevoCalculator){
        this.crcCalculator = nuevoCalculator;
    }

    public CRC_Calculator getCrcCalculator() {
        return crcCalculator;
    }


    public Connection getConnection() {
        return connection;
    }


}
