package org.example.ejercicio7;

import java.time.Duration;
import java.time.LocalDateTime;

public class Paused extends Estado{


    @Override
    public void togglePause(ToDoItem task) {
        task.setEstado(new InProgress());
    }

    @Override
    public void finish(ToDoItem task){
        task.setEstado(new Finished());
    }


}
