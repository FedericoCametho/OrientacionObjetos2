package org.example.parcial3.estadoExcursion;

import org.example.parcial3.Excursion;
import org.example.parcial3.Persona;

public class Completa extends Estado{
    @Override
    public void agregarUsuario(Persona persona, Excursion excursion) {
        excursion.agregarUnUsuarioAListaDeEspera(persona);
    }

    @Override
    public String getInformacionEspecifica(Excursion excursion) {
        return "";
    }
}
