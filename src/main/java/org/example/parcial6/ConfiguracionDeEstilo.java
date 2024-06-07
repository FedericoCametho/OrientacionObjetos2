package org.example.parcial6;

public class ConfiguracionDeEstilo {
    private String atributo;
    private String valor;
    public ConfiguracionDeEstilo(String atributo, String valor){
        this.atributo = atributo;
        this.valor = valor;
    }
    public String getEstiloBoton(){
        return String.format("%s:%s;", this.atributo, this.valor);
    }
    public String getEstiloEtiqueta(){
        return String.format("%s:%s;", this.atributo, this.valor);
    }
}
