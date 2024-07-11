package org.example.parcialRecuperatorio.configuraciones;

import org.example.parcialRecuperatorio.pc.Equipo;

public class Basico extends Config {
    @Override
    public Equipo crearEquipo() {
        Equipo equipo = new Equipo();
        equipo.addComponent(this.catalogo.getComponente("Procesador Basico"));
        equipo.addComponent(this.catalogo.getComponente("8 GB"));
        equipo.addComponent(this.catalogo.getComponente(" HDD 500 GB"));
        equipo.addComponent(this.catalogo.getComponente("Integrada"));
        equipo.addComponent(this.catalogo.getComponente("Gabinete Estandar"));
        return equipo;
    }
}
