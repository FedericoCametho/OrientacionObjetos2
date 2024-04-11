package org.example.ejercicio11;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class DispositivoTest {

    private Dispositivo dispositivo;
    private WifiConn wifiConn;
    private FourGConnection fourGConnection;
    private FourGAdapter fourGAdapter;
    private Ringer ringer;
    private Display display;
    private CRC16_Calculator crc16Calculator;
    private CRC32_Calculator crc32Calculator;

    @BeforeEach
    public void setUp(){
        this.wifiConn = new WifiConn("WiFi");
        this.fourGConnection = new FourGConnection("4G");
        this.fourGAdapter = new FourGAdapter(this.fourGConnection);
        this.ringer = new Ringer();
        this.display = new Display();
        this.crc16Calculator = new CRC16_Calculator();
        this.crc32Calculator = new CRC32_Calculator();
        this.dispositivo = new Dispositivo(crc16Calculator,wifiConn,ringer,display);
    }

    @Test
    public void cambiarConexionTest(){
        assertTrue(this.dispositivo.getConnection() instanceof WifiConn);
        this.dispositivo.cambiarConexion(this.fourGAdapter);
        assertTrue(this.dispositivo.getConnection() instanceof FourGAdapter);

        this.dispositivo.cambiarConexion(this.wifiConn);
        assertTrue(this.dispositivo.getConnection() instanceof WifiConn);
    }


    @Test
    public void cambiarCalculadorTest(){
        assertTrue(this.dispositivo.getCrcCalculator() instanceof CRC16_Calculator);
        this.dispositivo.cambiarCalculator(this.crc32Calculator);
        assertTrue(this.dispositivo.getCrcCalculator() instanceof  CRC32_Calculator);

        this.dispositivo.cambiarCalculator(this.crc16Calculator);
        assertTrue(this.dispositivo.getCrcCalculator() instanceof CRC16_Calculator);
    }

    @Test
    public void sendTest(){
        String msj = "mensajeRandom";
        String crc16 = "60896";
        String crc32 = "2590920841";

        assertEquals("Transmitiendo Data desde Wifi "+msj+" - crc: "+crc16, this.dispositivo.send(msj));
        this.dispositivo.cambiarCalculator(this.crc32Calculator);
        assertEquals("Transmitiendo Data desde Wifi "+msj+" - crc: "+crc32, this.dispositivo.send(msj));

        this.dispositivo.cambiarConexion(this.fourGAdapter);
        assertEquals("Transmitiendo Data desde 4g "+msj+" - crc: "+crc32, this.dispositivo.send(msj));
        this.dispositivo.cambiarCalculator(this.crc16Calculator);
        assertEquals("Transmitiendo Data desde 4g "+msj+" - crc: "+crc16, this.dispositivo.send(msj));
    }

}
