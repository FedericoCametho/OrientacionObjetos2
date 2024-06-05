package org.example.parcial2;


public abstract class Tarea {

    protected String nombre;//Nombre de la tarea
    protected String desc; //Descripcion

    public Tarea(String nombre, String desc){
        this.nombre=nombre;
        this.desc=desc;
    }



    public abstract int getDuracionEstimada();

    public abstract long getDuracionTotal();

    public abstract double getAvanceTarea();

    public abstract void iniciarTarea();

    public abstract void finalizarTarea();

}
