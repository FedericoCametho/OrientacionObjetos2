package org.example.ejercicio8;

import java.util.stream.Collectors;

public class Definitiva extends State{


    public void agregarInscripcion(Usuario usu, Excursion excursion){
        excursion.sumarInscripcion(usu);
        if (excursion.getPasajerosConfirmados().size() == excursion.getCupoMax()){
            excursion.setState(new Completa());
        }
    }

    @Override
    public String  mostrarInformacion(Excursion excursion){
        String emails = excursion.getPasajerosConfirmados().stream().map(Usuario::getEmail).collect(Collectors.toList()).toString();
        return super.mostrarInformacion(excursion)
                        + " - " + emails
                        + " - Cantidad de usuarios Faltantes para cupo maximo: " + (excursion.getCupoMax() - excursion.getPasajerosConfirmados().size());
    }

}
