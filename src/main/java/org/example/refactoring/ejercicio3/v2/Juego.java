package org.example.refactoring.ejercicio3.v2;

public class Juego {
    private static int PUNTOS_INCREMENTO = 100;
    private static int PUNTOS_DECREMENTO = -50;
    public void incrementarPuntosJugador(Jugador jugador) {
        jugador.incrementarPuntos(PUNTOS_INCREMENTO);
    }
    public void decrementarPuntosJugador(Jugador jugador) {
        jugador.decrementarPuntos(PUNTOS_DECREMENTO);
    }

}
