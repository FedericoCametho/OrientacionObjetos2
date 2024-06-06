package org.example.parcial3.estadoExcursion;

import org.example.parcial3.Excursion;
import org.example.parcial3.Persona;

public class Definitiva extends Estado{
    @Override
    public void agregarUsuario(Persona persona, Excursion excursion) {
        excursion.agregarUnUsuarioAListaDePasajeros(persona);
        if (excursion.validarCupoMaximoAlcanzado()){
            excursion.setEstado(new Completa());
        }
    }

    @Override
    public String getInformacionEspecifica(Excursion excursion) {
        return  " - EMAILS: "+excursion.printEmails()
                +" - CANTIDAD PERSONAS FALTANTES PARA CUPO MAXIMO: "+excursion.calcularPersonasFaltantesCupoMaximo();
    }
}
