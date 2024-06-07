package org.example.parcial6.composite;

import org.example.parcial6.ConfiguracionDeEstilo;

public abstract class ElementoConTexto implements Elemento{
    protected String texto;
    protected String estiloActual;

    public ElementoConTexto(String texto) {
        this.texto = texto;
        this.estiloActual = "";
    }
    @Override
    public void aplicarEstilo(ConfiguracionDeEstilo configuracionDeEstilo) {
        this.estiloActual = this.estiloActual + configuracionDeEstilo.getEstiloEtiqueta();
    }


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEstiloActual() {
        return estiloActual;
    }

    public void setEstiloActual(String estiloActual) {
        this.estiloActual = estiloActual;
    }
}
