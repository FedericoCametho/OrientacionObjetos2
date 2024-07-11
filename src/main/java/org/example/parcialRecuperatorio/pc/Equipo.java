package org.example.parcialRecuperatorio.pc;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private List<Componente> componentes;

    public Equipo() {
        this.componentes = new ArrayList<>();
    }

    public void addComponent(Componente  componente){
        this.componentes.add(componente);
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public double calcularConsumo(){
        return this.componentes.stream().mapToDouble(Componente::getConsumo).sum();
    }
    public double calcularPrecio(){
        return this.componentes.stream().mapToDouble(Componente::getPrecio).sum() * 1.21;
    }
}
