package org.example.parcial6.composite;

import org.example.parcial6.ConfiguracionDeEstilo;

import java.util.List;
import java.util.stream.Collectors;

public class Contenedor implements Elemento {
    private List<Elemento> elementos;
    public Contenedor(List<Elemento> elementos){
        this.elementos = elementos;
    }

    @Override
    public void aplicarEstilo(ConfiguracionDeEstilo configuracionDeEstilo) {
        this.elementos.forEach(e -> e.aplicarEstilo(configuracionDeEstilo));
    }

    @Override
    public String imprimir() {
        return
                "<contenedor>\n"
        +this.elementos.stream().map(Elemento::imprimir).collect(Collectors.joining("\n"))
        +"\n</contenedor>";
    }
}
