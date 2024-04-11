package org.example.ejercicio8;

public class Completa extends State{

    public void agregarInscripcion(Usuario usu, Excursion excursion){
        excursion.sumarListaDeEspera(usu);
    }



}
