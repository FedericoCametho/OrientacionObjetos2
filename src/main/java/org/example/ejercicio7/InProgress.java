package org.example.ejercicio7;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress extends Estado{

    @Override
    public void togglePause(ToDoItem task) {
        task.setEstado(new Paused());
    }

    @Override
    public void finish(ToDoItem task){
        task.setEstado(new Finished());
        task.setFin(LocalDateTime.now());
    }



}
