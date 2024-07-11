package org.example.parcialRecuperatorio.configuraciones;

import org.example.parcialRecuperatorio.pc.Catalogo;
import org.example.parcialRecuperatorio.pc.Equipo;

public abstract class Config {
    protected Catalogo catalogo;
    public abstract Equipo crearEquipo();
}
