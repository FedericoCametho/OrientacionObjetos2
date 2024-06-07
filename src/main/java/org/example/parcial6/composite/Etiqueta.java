package org.example.parcial6.composite;


public class Etiqueta extends ElementoConTexto {


    public Etiqueta(String texto) {
        super(texto);
    }


    @Override
    public String imprimir() {
        return "<etiqueta estilo=\"" + this.estiloActual + "\" />"+this.texto+"</etiqueta>";
    }
}
