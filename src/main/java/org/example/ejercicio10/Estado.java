package org.example.ejercicio10;

public abstract class Estado {

    public void cancelarProyecto(Proyecto proyecto){
        proyecto.setObjetivo(proyecto.getObjetivo().concat(" - CANCELADO"));
        proyecto.setEstado(new Cancelado());
    }
    public void modificarMargenGanancia(Proyecto proyecto, double nuevoMargen){
    }
    public void aprobarEtapa(Proyecto proyecto){
    }
}
