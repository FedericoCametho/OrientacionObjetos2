package org.example.parcial5.state;

import org.example.parcial5.Proyecto;

public class Cancelado extends Estado{
    @Override
    public void aprobarEtapa(Proyecto proyecto) {
        System.out.println("EL proyecto se encuentra en etapa cancelado");
    }

    @Override
    public void modificarMargenGanancia(Proyecto proyecto, double nuevoMargen) {
        System.out.println("No es posible modificar el margen de ganancia en un proyecto en etapa cancelado");
    }
    public void cancelarProyecto(Proyecto proyecto){
        System.out.println("El proyecto YA se encuentra en la etapa cancelado");
    }
}
