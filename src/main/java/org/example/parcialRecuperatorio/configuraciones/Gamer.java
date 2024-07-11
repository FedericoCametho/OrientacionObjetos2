package org.example.parcialRecuperatorio.configuraciones;

import org.example.parcialRecuperatorio.pc.Equipo;

public class Gamer extends Config{
    @Override
    public Equipo crearEquipo() {
        Equipo equipo = new Equipo();
        equipo.addComponent(this.catalogo.getComponente("Procesador Gamer"));
        equipo.addComponent(this.catalogo.getComponente("Pad termico"));
        equipo.addComponent(this.catalogo.getComponente("cooler"));
        equipo.addComponent(this.catalogo.getComponente("32 GB"));
        equipo.addComponent(this.catalogo.getComponente("32 GB"));
        equipo.addComponent(this.catalogo.getComponente(" SDD 500 GB"));
        equipo.addComponent(this.catalogo.getComponente(" SDD 1 tB"));
        equipo.addComponent(this.catalogo.getComponente("RTX 4090"));
        equipo.addComponent(this.catalogo.getComponente("Gabinete Gamer"));
        double consumoEquipo = equipo.calcularConsumo();
        equipo.addComponent(this.catalogo.getComponente("Fuente "+consumoEquipo * 1.5+" w"));
        return equipo;
    }
}
