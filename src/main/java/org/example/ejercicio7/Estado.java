package org.example.ejercicio7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Estado {



    /**
     * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
     * pending. Si se encuentra en otro estado, no hace nada.
     */
    public void start(ToDoItem task){}

    /**
     * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
     * estado es paused. Caso contrario (pending o finished) genera un error
     * informando la causa específica del mismo.
     */
    public abstract void togglePause(ToDoItem task);


    /**
     * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
     * in-progress o paused. Si se encuentra en otro estado, no hace nada.
     */
    public void finish(ToDoItem task){}


/**
 * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
 * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
 * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
 * genera un error informando la causa específica del mismo.
 */

    public Duration workedTime(ToDoItem task) {
        return Duration.between(task.getInicio(), LocalDateTime.now());
    }


    /**
     * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
     * contrario no hace nada."
     */
    public void addComment(String comment, ToDoItem task){
        task.addComentario(comment);
    }

 }
