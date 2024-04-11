package org.example.ejercicio9;

public class RSAEncripter extends Encryptador implements Conexion{



    @Override
    public String enviar(String mensaje) {
        return this.getConexion().enviar(mensaje).concat(" - Encryptado por RSA -");
    }
}
