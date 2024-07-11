package org.example.parcialRecuperatorio.configuraciones;

import org.example.parcialRecuperatorio.pc.Equipo;

public class Intermedio extends Config{
    @Override
    public Equipo crearEquipo() {
        Equipo equipo = new Equipo();
        equipo.addComponent(this.catalogo.getComponente("Procesador Intermedio"));
        equipo.addComponent(this.catalogo.getComponente("16 GB"));
        equipo.addComponent(this.catalogo.getComponente(" SDD 500 GB"));
        equipo.addComponent(this.catalogo.getComponente("GTX 1650"));
        equipo.addComponent(this.catalogo.getComponente("Gabinete Intermedio"));
        equipo.addComponent(this.catalogo.getComponente("Fuente 800w"));
        return equipo;
    }
}
