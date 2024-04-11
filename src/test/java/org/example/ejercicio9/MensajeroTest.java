package org.example.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class MensajeroTest {

    private Mensajero mensajero;
    private Conexion conexionSegura;
    private RSAEncripter rsa;
    private BlowfishEncripter blowfish;
    private RC4 rc4;

    @BeforeEach
    public void setUp(){
        this.blowfish = new BlowfishEncripter();
        this.rsa = new RSAEncripter();
        this.rc4 = new RC4();
        this.conexionSegura = new ConexionSegura();
        this.mensajero = new Mensajero();
    }

    @Test
    public void enviarTest(){
        String msj = "Hola";
        mensajero.setConexion(conexionSegura);
        assertEquals("Hola", mensajero.enviar(msj));

        rsa.setConexion(conexionSegura);
        mensajero.setConexion(rsa);
        assertEquals("Hola - Encryptado por RSA -", mensajero.enviar(msj));

        blowfish.setConexion(rsa);
        mensajero.setConexion(blowfish);
        assertEquals("Hola - Encryptado por RSA - - Encryptado por BLOWFISH -", mensajero.enviar(msj));

        rc4.setConexion(blowfish);
        mensajero.setConexion(rc4);
        assertEquals("Hola - Encryptado por RSA - - Encryptado por BLOWFISH - - Encryptado por RC4 -", mensajero.enviar(msj));
    }

}
