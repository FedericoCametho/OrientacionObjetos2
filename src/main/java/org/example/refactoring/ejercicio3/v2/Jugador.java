package org.example.refactoring.ejercicio3.v2;

public class Jugador {
    private String nombre;
    private String apellido;
    private int puntuacion;

    public Jugador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntuacion = 0;
    }

    public void incrementarPuntos(int puntos){
        this.puntuacion+= puntos;
    }

    public void decrementarPuntos(int puntos){
        this.puntuacion-= puntos;
    }

}

