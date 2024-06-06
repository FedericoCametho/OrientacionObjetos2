package org.example.parcial3.estadoExcursion;

import org.example.parcial3.Excursion;
import org.example.parcial3.Persona;

public class Provisoria extends Estado{


    @Override
    public void agregarUsuario(Persona persona, Excursion excursion) {
        excursion.agregarUnUsuarioAListaDePasajeros(persona);
        if (excursion.validarCupoMinimoAlcanzado()){
            excursion.setEstado(new Definitiva());
        }
    }

    @Override
    public String getInformacionEspecifica(Excursion excursion) {
        return " - CANTIDAD PERSONAS FALTANTES PARA CUPO MINIMO: "+excursion.calcularPersonasFaltantesCupoMinimo();
    }
}
