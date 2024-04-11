package org.example.ejercicio3;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class MediaPlayerTest {

    private MediaPlayer mediaPlayer;
    private Audio audioFile1;
    private Audio audioFile2;
    private VideoFile videoFile1;
    private VideoFile videoFile2 ;

    private VideoStream videoStream;
    private MediaAdapter mediaAdapter;


    @BeforeEach
    public void setUp(){
        mediaPlayer = new MediaPlayer();
        audioFile1 = new Audio("Audio 1");
        audioFile2 = new Audio("Audio 2");
        videoFile1 = new VideoFile("Video 1");
        videoFile2 = new VideoFile("Video 2");
        videoStream = new VideoStream("Video Streaming");
        mediaAdapter = new MediaAdapter(videoStream);
    }

    @Test
    public void agregarMediaFileTest(){
        assertEquals(0, this.mediaPlayer.getMediaPlaylist().size());
        this.mediaPlayer.agregarMediaFile(audioFile1);
        this.mediaPlayer.agregarMediaFile(audioFile2);
        this.mediaPlayer.agregarMediaFile(videoFile1);
        this.mediaPlayer.agregarMediaFile(videoFile2);
        this.mediaPlayer.agregarMediaFile(mediaAdapter);
        assertEquals(5, this.mediaPlayer.getMediaPlaylist().size());
    }

    @Test
    public void reproducirListaTest(){
        this.mediaPlayer.agregarMediaFile(audioFile1);
        this.mediaPlayer.agregarMediaFile(audioFile2);
        this.mediaPlayer.agregarMediaFile(videoFile1);
        this.mediaPlayer.agregarMediaFile(videoFile2);
        this.mediaPlayer.agregarMediaFile(mediaAdapter);
        List<String> reproduccionDeArchivos = this.mediaPlayer.reproducirLista();
        assertTrue(reproduccionDeArchivos.contains(audioFile1.play()));
        assertEquals(5,reproduccionDeArchivos.size());
        reproduccionDeArchivos.forEach(file -> System.out.println(file));
    }






}
