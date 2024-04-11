package org.example.ejercicio7;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends Estado{

    @Override
    public void start(ToDoItem task){
        task.setInicio(LocalDateTime.now());
        task.setEstado(new InProgress());
    }

    @Override
    public void togglePause(ToDoItem task) throws RuntimeException{
        throw new RuntimeException("No se puede pausear una tarea en estado Pendiente, el objeto ToDoItem debe encontrarse en estado in-progress o paused");
    }

    @Override
    public Duration workedTime(ToDoItem task)throws RuntimeException {
        throw new RuntimeException(("La tarea no ha sido iniciada aun, se encuentra en estado pendiente"));
    }


}
