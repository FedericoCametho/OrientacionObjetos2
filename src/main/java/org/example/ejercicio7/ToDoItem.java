package org.example.ejercicio7;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ToDoItem {

    private LocalDateTime inicio;
    private LocalDateTime fin;
    private String nombre;
    private Estado estado;

    private ArrayList<String> comentarios;

    public ToDoItem(String name){
        this.nombre = name;
        this.estado = new Pending();
        this.comentarios = new ArrayList<String>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void addComentario(String comentarios) {
        this.comentarios.add(comentarios);
    }

    /**
     * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
     * pending. Si se encuentra en otro estado, no hace nada.
     */
    public void start(){
        estado.start(this);
    }

    /**
     * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
     * estado es paused. Caso contrario (pending o finished) genera un error
     * informando la causa específica del mismo.
     */
    public void togglePause(){
        estado.togglePause(this);
    };


    /**
     * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
     * in-progress o paused. Si se encuentra en otro estado, no hace nada.
     */
    public void finish(){
        estado.finish(this);
    };


    /**
     * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
     * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
     * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
     * genera un error informando la causa específica del mismo.
     */
    public Duration workedTime(){
        return estado.workedTime(this);
    }


    /**
     * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
     * contrario no hace nada."
     */
    public void addComment(String comment){
        estado.addComment(comment, this);
    }
}
