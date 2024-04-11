package org.example.ejercicio10;

public class EnConstruccion extends Estado{


    @Override
    public void modificarMargenGanancia(Proyecto proyecto, double nuevoMargen){
        if (nuevoMargen >= 0.08 && nuevoMargen <= 0.10){
            proyecto.setMargenGanancia(nuevoMargen);
        }
    }

    @Override
    public void aprobarEtapa(Proyecto proyecto){
        proyecto.setEstado(new EnEvaluacion());
    }
}
