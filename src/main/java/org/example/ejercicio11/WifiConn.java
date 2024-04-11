package org.example.ejercicio11;

public class WifiConn implements Connection{

    private String pict;

    public WifiConn(String pict){
        this.pict = pict;
    }
    @Override
    public String sendData(String data, long crc) {
        return "Transmitiendo Data desde Wifi "+data+" - crc: "+crc;
    }

    @Override
    public String pict() {
        return this.pict;
    }



}
