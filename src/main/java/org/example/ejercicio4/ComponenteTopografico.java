package org.example.ejercicio4;

public abstract class ComponenteTopografico {

    public abstract double getProporcionAgua();
    public double getProporcionTierra(){
        return 1.00 - this.getProporcionAgua();
    }

    public boolean isEqual(ComponenteTopografico comp2){
        return (this.getProporcionAgua() == comp2.getProporcionAgua()) && this.equals(comp2);
    }

}
