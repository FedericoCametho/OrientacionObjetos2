package org.example.parcial5.state;

import org.example.parcial5.Proyecto;

public class EnConstruccion extends Estado{
    private static Double MARGEN_MAXIMO = 0.10;
    private static Double MARGEN_MINIMO = 0.08;
    @Override
    public void aprobarEtapa(Proyecto proyecto) {
        if(proyecto.calcularPrecioProyecto() > 0){
            proyecto.setEstado(new EnEvaluacion());
        } else {
            throw new RuntimeException("El proyecto no puede tener costo cero");
        }
    }

    @Override
    public void modificarMargenGanancia(Proyecto proyecto, double nuevoMargen) {
        if(this.validarMargenGanancia(MARGEN_MAXIMO, MARGEN_MINIMO, nuevoMargen)){
            proyecto.setMargenGanancia(nuevoMargen);
        }
    }




}
