package org.example.parcial5.state;

import org.example.parcial5.Proyecto;

public abstract class Estado {
    public static String CANCEL_LABEL = "(Cancelado)";
    public abstract void aprobarEtapa(Proyecto proyecto);
    public abstract void modificarMargenGanancia(Proyecto proyecto, double nuevoMargen);

    protected boolean validarMargenGanancia(double max, double min, double nuevo){
        return nuevo <= max && nuevo >= min;
    }

    public void cancelarProyecto(Proyecto proyecto){
        proyecto.setObjetivo(proyecto.getObjetivo()+ CANCEL_LABEL);
        proyecto.setEstado(new Cancelado());
    }

}
