package org.example.parcial2;

import java.util.ArrayList;

public class Compleja extends Tarea {
    private ArrayList<Tarea> tareas;

    public Compleja(String nombre, String desc){
        super(nombre,desc);
        this.tareas = new ArrayList<Tarea>();
    }

    public void agregarTarea(Tarea tarea){
        this.tareas.add(tarea);
    }

    public int getDuracionEstimada(){
       return this.tareas.stream().mapToInt(t -> t.getDuracionEstimada()).sum();
    }

    @Override
    public long getDuracionTotal() {
        return this.tareas.stream().mapToLong(t -> t.getDuracionTotal()).sum();
    }

    @Override
    public double getAvanceTarea() {
        return (double) this.getDuracionTotal() / this.getDuracionEstimada();
    }

    public void iniciarTarea(){this.tareas.stream().forEach(t -> t.iniciarTarea());
    }

    public void finalizarTarea(){
        this.tareas.stream().forEach(t -> t.finalizarTarea());
    }
}
