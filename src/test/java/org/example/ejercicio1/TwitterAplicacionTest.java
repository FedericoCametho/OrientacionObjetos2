package org.example.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwitterAplicacionTest {
    private TwitterAplicacion twitter;

    private Usuario usuarioAEliminar;

    private Tweet tweetOriginal;


    @BeforeEach
    public void setUp() throws Exception {
        twitter = new TwitterAplicacion();
        twitter.agregarUsuario("Amy Lee");
        usuarioAEliminar = twitter.buscarUsuario("Amy Lee");
        tweetOriginal = new Tweet ("Este es un tweet Original");
        usuarioAEliminar.agregarNuevoTweet("Tweet1");
        usuarioAEliminar.agregarNuevoTweet("Tweet2");
        usuarioAEliminar.reTweetear("Este es un retweet 3", tweetOriginal);

    }

    @Test
    public void testCargarUsuario() {
        assertEquals(1, twitter.getUsuarios().size());
        twitter.agregarUsuario("Lana Del Rey");
        twitter.agregarUsuario("Taylor Swift");
        twitter.agregarUsuario("Taylor Swift");
        twitter.agregarUsuario("Lana Del Rey");
        assertEquals(3,twitter.getUsuarios().size());

    }

    @Test
    public void testEliminarUsuario() {
        assertEquals(3,usuarioAEliminar.getListaTweet().size());
        twitter.eliminarUsuario(usuarioAEliminar.getUsername());
        assertEquals(0,usuarioAEliminar.getListaTweet().size());
        assertEquals(0, twitter.getUsuarios().size());

    }
}