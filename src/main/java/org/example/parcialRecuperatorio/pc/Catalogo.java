package org.example.parcialRecuperatorio.pc;

import java.util.List;

public class Catalogo {
    private List<Componente> componentes;
    public Componente getComponente(String descripcion){
        return this.componentes.stream().filter(componente -> componente.getDescripcion().equals(descripcion)).findFirst().orElse(null);
    }
}
