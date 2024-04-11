package org.example.ejercicio10;

public class EnEvaluacion extends Estado{



    @Override
    public void modificarMargenGanancia(Proyecto proyecto, double nuevoMargen){
        if (nuevoMargen >= 0.11 && nuevoMargen <= 0.15){
            proyecto.setMargenGanancia(nuevoMargen);
        }
    }

    @Override
    public void aprobarEtapa(Proyecto proyecto){
        proyecto.setEstado(new Confirmado());
    }
}
