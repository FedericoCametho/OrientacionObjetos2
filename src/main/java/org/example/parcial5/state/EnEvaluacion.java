package org.example.parcial5.state;

import org.example.parcial5.Proyecto;

public class EnEvaluacion extends Estado{

    private static Double MARGEN_MAXIMO = 0.15;
    private static Double MARGEN_MINIMO = 0.11;
    @Override
    public void aprobarEtapa(Proyecto proyecto) {
        proyecto.setEstado(new Confirmado());
    }
    @Override
    public void modificarMargenGanancia(Proyecto proyecto, double nuevoMargen) {
        if(this.validarMargenGanancia(MARGEN_MAXIMO, MARGEN_MINIMO, nuevoMargen)){
            proyecto.setMargenGanancia(nuevoMargen);
        }
    }
}
