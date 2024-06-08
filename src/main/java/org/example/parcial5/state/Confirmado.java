package org.example.parcial5.state;

import org.example.parcial5.Proyecto;

public class Confirmado extends Estado{
    @Override
    public void aprobarEtapa(Proyecto proyecto) {
        System.out.println("EL proyecto ya esta se encuentra en etapa confirmada");
    }

    @Override
    public void modificarMargenGanancia(Proyecto proyecto, double nuevoMargen) {
        System.out.println("No es posible modificar el margen de ganancia en un proyecto en etapa confirmada");
    }
}
