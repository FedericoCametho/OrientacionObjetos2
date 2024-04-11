package org.example.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Topografia extends ComponenteTopografico{


    private List<ComponenteTopografico> componentes;

    public Topografia(ComponenteTopografico c1, ComponenteTopografico c2, ComponenteTopografico c3, ComponenteTopografico c4){
        this.componentes = new ArrayList<ComponenteTopografico>();
        this.componentes.add(c1);
        this.componentes.add(c2);
        this.componentes.add(c3);
        this.componentes.add(c4);
    }

    public List<ComponenteTopografico> getComponentes(){
        return this.componentes;
    }
//    public void agregarComponenteTopografico(ComponenteTopografico comp){
//        if (this.componentes.size() < 4){
//            this.componentes.add(comp);
//        }
//    }

//    public void eliminarComponenteTopografico(ComponenteTopografico comp){
//        this.componentes.remove(comp);
//    }

    public ComponenteTopografico getChild(int i){
        return (i < this.componentes.size()) ? this.componentes.get(i) : null;
    }


    @Override
    public double getProporcionAgua(){
        return (this.componentes.stream().mapToDouble(t -> t.getProporcionAgua()).sum() / this.componentes.size());
    }

}
