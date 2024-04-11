package org.example.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    Usuario user;
    String textoVacio;
    String textoLargo;
    String textoValido;
    Tweet tweetOriginal;

    @BeforeEach
    void setUp(){
        user = new Usuario("Pepe Argento");
        textoLargo = "asdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasd";
        textoVacio = "";
        textoValido = "un tweet cualquiera";
        tweetOriginal = new Tweet(textoValido + " original");
    }

    @Test
    void agregarNuevoTweet() {
        user.agregarNuevoTweet(textoVacio);
        assertEquals(0, user.getListaTweet().size());
        user.agregarNuevoTweet(textoLargo);
        assertEquals(0, user.getListaTweet().size());
        user.agregarNuevoTweet(textoValido);
        assertEquals(1, user.getListaTweet().size());
    }

    @Test
    void reTweetear() {
        user.reTweetear("Es un retweet", tweetOriginal);
        assertEquals(1, user.getListaTweet().size());
        assertEquals(1, tweetOriginal.getRetweets().size());
    }

    @Test
    void borrarTweets() {
        assertEquals(0, user.getListaTweet().size());
        user.agregarNuevoTweet(textoValido);
        user.reTweetear("Es un retweet", tweetOriginal);
        assertEquals(2, user.getListaTweet().size());
        user.borrarTweets();
        assertEquals(0, user.getListaTweet().size());
    }
}