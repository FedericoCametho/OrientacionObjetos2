package org.example.parcial3.estadoExcursion;

import org.example.parcial3.Excursion;
import org.example.parcial3.Persona;

public abstract class Estado {

    public abstract void agregarUsuario(Persona persona, Excursion excursion);
    public abstract String getInformacionEspecifica(Excursion excursion);
    public String infoDefault(Excursion excursion){
        return "NOMBRE: "+excursion.getNombre()+" - COSTO: "+ excursion.getCosto()+" - FECHA INICIO: "+excursion.getFechaInicio()
                +" - FECHA FIN: "+excursion.getFechaFin()+ " - PUNTO DE ENCUENTRO: "+excursion.getPuntoEncuentro()
                +this.getInformacionEspecifica(excursion);
    }
}
