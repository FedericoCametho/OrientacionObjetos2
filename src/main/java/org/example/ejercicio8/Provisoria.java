package org.example.ejercicio8;

public class Provisoria extends State{

    public void agregarInscripcion(Usuario usu, Excursion excursion){
        excursion.sumarInscripcion(usu);
        if (excursion.getPasajerosConfirmados().size() == excursion.getCupoMin()){
            excursion.setState(new Definitiva());
        }
    }

    @Override
    public String  mostrarInformacion(Excursion excursion){
        return super.mostrarInformacion(excursion)
                + " - Cantidad de usuarios Faltantes para cupo minimo: " + (excursion.getCupoMin() - excursion.getPasajerosConfirmados().size());
    }


}
