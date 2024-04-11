package org.example.ejercicio8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {

    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String puntoEncuentro;
    private Double costo;

    private State state;
    private List<Usuario> pasajerosConfirmados;

    private List<Usuario> listaDeEspera;
    private int cupoMin;
    private int cupoMax;

    public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, Double costo, int cupoMin, int cupoMax){
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntoEncuentro = puntoEncuentro;
        this.costo = costo;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
        this.state = new Provisoria();
        this.pasajerosConfirmados = new ArrayList<Usuario>();
        this.listaDeEspera = new ArrayList<Usuario>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public void setPuntoEncuentro(String puntoEncuentro) {
        this.puntoEncuentro = puntoEncuentro;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public List<Usuario> getPasajerosConfirmados() {
        return pasajerosConfirmados;
    }



    public int getCupoMin() {
        return cupoMin;
    }

    public void setCupoMin(int cupoMin) {
        this.cupoMin = cupoMin;
    }

    public int getCupoMax() {
        return cupoMax;
    }

    public void setCupoMax(int cupoMax) {
        this.cupoMax = cupoMax;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Usuario> getListaDeEspera() {
        return listaDeEspera;
    }

    public void agregarInscripcion(Usuario usu){
        this.state.agregarInscripcion(usu, this);
    }

    public void sumarInscripcion(Usuario usu){
        this.pasajerosConfirmados.add(usu);
    }

    public void sumarListaDeEspera(Usuario usu){
        this.listaDeEspera.add(usu);
    }

    public String  mostrarInformacion(){
        return this.state.mostrarInformacion(this);
    }

}
