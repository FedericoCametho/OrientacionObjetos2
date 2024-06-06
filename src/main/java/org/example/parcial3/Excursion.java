package org.example.parcial3;

import org.example.parcial3.estadoExcursion.Estado;
import org.example.parcial3.estadoExcursion.Provisoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String puntoEncuentro;
    private Double costo;
    private Integer cupoMinimo;
    private Integer cupoMaximo;
    private Estado estado;
    private List<Persona> personaList;
    private List<Persona> listaEspera;

    public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, Double costo, Integer cupoMinimo, Integer cupoMaximo) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntoEncuentro = puntoEncuentro;
        this.costo = costo;
        this.cupoMinimo = cupoMinimo;
        this.cupoMaximo = cupoMaximo;
        this.personaList = new ArrayList<>();
        this.listaEspera = new ArrayList<>();
        this.estado = new Provisoria();
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

    public Integer getCupoMinimo() {
        return cupoMinimo;
    }

    public void setCupoMinimo(Integer cupoMinimo) {
        this.cupoMinimo = cupoMinimo;
    }

    public Integer getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(Integer cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    public List<Persona> getListaEspera() {
        return listaEspera;
    }

    public void setListaEspera(List<Persona> listaEspera) {
        this.listaEspera = listaEspera;
    }

    public void agregarUnaPersonaALaExcursion(Persona persona){
        this.estado.agregarUsuario(persona, this);
    }

    public void agregarUnUsuarioAListaDePasajeros(Persona persona){
        this.personaList.add(persona);
    }
    public void agregarUnUsuarioAListaDeEspera(Persona persona){
        this.listaEspera.add(persona);
    }

    public boolean validarCupoMaximoAlcanzado(){
        return this.personaList.size() == this.cupoMaximo;
    }

    public boolean validarCupoMinimoAlcanzado(){
        return this.personaList.size() == this.cupoMinimo;
    }

    public Integer calcularPersonasFaltantesCupoMinimo(){
        return this.cupoMinimo - this.personaList.size();
    }
    public Integer calcularPersonasFaltantesCupoMaximo(){
        return this.cupoMaximo - this.personaList.size();
    }
    public String printEmails(){
        return this.personaList.stream().map(Persona::getEmail).collect(Collectors.joining(" - "));
    }

    public String obtenerInformacion(){
        return this.estado.infoDefault(this);
    }
}
