package org.example.ejercicio8;

public abstract class State {

    public abstract void agregarInscripcion(Usuario usu, Excursion excursion);

    public String  mostrarInformacion(Excursion excursion){
        return excursion.getNombre() + " - " + excursion.getCosto() + " - Ini: " + excursion.getFechaInicio() + " - Fin: " + excursion.getFechaFin()
                + " - " + excursion.getPuntoEncuentro();
    }

}
