package org.example.parcial2;


import java.time.LocalDateTime;

public class Esperando implements Estado {
    @Override
    public long getDuracionTotal(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        return 0;
    }

    @Override
    public void iniciarTarea(Simple tarea) {
        tarea.setState(new Iniciado());
    }

    @Override
    public void finalizarTarea(Simple tarea) {
        System.out.println("La tarea no se encuentra iniciada");
    }
}
