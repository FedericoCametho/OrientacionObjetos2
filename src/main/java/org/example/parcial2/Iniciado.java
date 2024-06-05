package org.example.parcial2;


import java.time.LocalDateTime;

public class Iniciado implements Estado {
    @Override
    public long getDuracionTotal(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        return 0;
    }

    @Override
    public void iniciarTarea(Simple tarea) {
        System.out.println("ya se encuentra Iniciado");
    }

    @Override
    public void finalizarTarea(Simple tarea) {
        tarea.setState(new Terminado());
    }
}
