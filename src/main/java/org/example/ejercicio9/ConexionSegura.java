package org.example.ejercicio9;

public class ConexionSegura implements Conexion{


    public ConexionSegura(){
    }


    @Override
    public String enviar(String mensaje) {
        return mensaje;
    }
}
