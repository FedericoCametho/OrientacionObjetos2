package org.example.parcial6;

import org.example.parcial6.adapter.ListDesplegableAdapter;
import org.example.parcial6.adapter.ListaDesplegable;
import org.example.parcial6.composite.Boton;
import org.example.parcial6.composite.Contenedor;
import org.example.parcial6.composite.Etiqueta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class HtmlAplicationTest {

    private Contenedor contenedor;
    private Boton boton;
    private Etiqueta etiqueta;
    private ListDesplegableAdapter listDesplegableAdapter;
    private ListaDesplegable listaDesplegable;


    @BeforeEach
    public void setUp(){
        this.boton = new Boton("Aceptar", "accept()");
        this.etiqueta = new Etiqueta("Parcial de objetos");

        //setteo de estilos para el boton
        this.boton.aplicarEstilo(new ConfiguracionDeEstilo("color","red"));
        this.boton.aplicarEstilo(new ConfiguracionDeEstilo("text-size","10px"));

        //setteo de estilos para etiqueta
        this.etiqueta.aplicarEstilo(new ConfiguracionDeEstilo("color","blue"));
        this.etiqueta.aplicarEstilo(new ConfiguracionDeEstilo("text-size","12px"));

        this.contenedor = new Contenedor(Arrays.asList(this.boton, this.etiqueta));

        this.listaDesplegable = new ListaDesplegable();
        this.listDesplegableAdapter = new ListDesplegableAdapter(this.listaDesplegable);
    }

    @Test
    public void testImprimirElementoHtml(){
        String boton = this.boton.imprimir();
        String etiqueta = this.etiqueta.imprimir();
        String listaDesplegable = this.listDesplegableAdapter.imprimir();
        String contenedor = this.contenedor.imprimir();

        Assertions.assertNotNull(contenedor);

        System.out.println(boton);
        System.out.println(etiqueta);
        System.out.println(listaDesplegable);
        System.out.println(contenedor);

    }
}
