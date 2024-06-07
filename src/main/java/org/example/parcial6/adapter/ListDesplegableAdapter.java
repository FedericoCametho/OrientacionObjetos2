package org.example.parcial6.adapter;

import org.example.parcial6.ConfiguracionDeEstilo;
import org.example.parcial6.composite.Elemento;

public class ListDesplegableAdapter implements Elemento {
    private ListaDesplegable listaDesplegable;

    public ListDesplegableAdapter(ListaDesplegable listaDesplegable) {
        this.listaDesplegable = listaDesplegable;
    }

    @Override
    public void aplicarEstilo(ConfiguracionDeEstilo configuracionDeEstilo) {
        this.listaDesplegable.setStyle(configuracionDeEstilo.getEstiloEtiqueta());
    }

    @Override
    public String imprimir() {
        return this.listaDesplegable.print();
    }
}
