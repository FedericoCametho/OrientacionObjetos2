package org.example.ejercicio9;

public class Mensajero {

    private Conexion conexion;


    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public String enviar(String mensaje){
        return this.conexion.enviar(mensaje);
    }


}
