package org.example.ejercicio11;

import java.util.zip.CRC32;

public class CRC32_Calculator extends CRC_Calculator{

    @Override
    public long crcFor(String datos) {
        CRC32 crc = new CRC32();
        crc.update(datos.getBytes());
        return crc.getValue();
    }
}
