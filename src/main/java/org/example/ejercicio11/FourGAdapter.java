package org.example.ejercicio11;

public class FourGAdapter implements Connection{

    private FourGConnection fourGConnection;

    public FourGAdapter(FourGConnection con){
        this.fourGConnection = con;
    }
    @Override
    public String sendData(String data, long crc) {
        return this.fourGConnection.transmit(data, crc);
    }

    @Override
    public String pict() {
        return this.fourGConnection.getSymb();
    }
}
