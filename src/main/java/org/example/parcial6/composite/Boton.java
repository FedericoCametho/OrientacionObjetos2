package org.example.parcial6.composite;

public class Boton extends ElementoConTexto {
    private String accion;

    public Boton( String texto, String accion) {
        super(texto);
        this.accion = accion;
    }



    @Override
    public String imprimir() {
        return "<boton estilo=\"" + this.estiloActual+"\"" + " texto=\""+this.texto+"\" accion=\""+this.accion+"\"" + "/>";
    }
}
