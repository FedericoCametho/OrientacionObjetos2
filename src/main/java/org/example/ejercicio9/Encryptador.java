package org.example.ejercicio9;

public abstract class Encryptador implements Conexion{
    // clase DECORATOR

    private Conexion conexion;

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public String enviar(String mensaje) {
        return this.conexion.enviar(mensaje);
    }

}
