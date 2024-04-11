package org.example.ejercicio11;

public class FourGConnection {

    private String symb;

    public FourGConnection(String symb){
        this.symb = symb;
    }

    public String transmit(String data, long crc){
        return "Transmitiendo Data desde 4g "+data+" - crc: "+crc;
    }

    public String getSymb() {
        return symb;
    }

    public void setSymb(String symb) {
        this.symb = symb;
    }
}
