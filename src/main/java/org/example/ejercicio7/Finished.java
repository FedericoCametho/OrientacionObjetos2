package org.example.ejercicio7;

import java.time.Duration;
import java.time.LocalDateTime;

public class Finished extends Estado{

    @Override
    public void togglePause(ToDoItem task) throws RuntimeException{
        throw new RuntimeException("No se puede pausear una tarea en estado Finalizado, el objeto ToDoItem debe encontrarse en estado in-progress o paused");
    }

    @Override
    public void addComment(String comment, ToDoItem task){
        throw new RuntimeException("No se puede agregar un comentario en estado Finalizado, el objeto ToDoItem debe encontrarse en estado in-progress o paused");
    }

    @Override
    public Duration workedTime(ToDoItem task) {
        return Duration.between(task.getInicio(), task.getFin());
    }

}
