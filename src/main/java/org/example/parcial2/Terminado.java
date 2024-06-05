package org.example.parcial2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Terminado implements Estado {

    @Override
    public long getDuracionTotal(LocalDateTime fechaInicio, LocalDateTime fechaFin){
        return ChronoUnit.HOURS.between(fechaInicio, fechaFin);
    }

    @Override
    public void iniciarTarea(Simple tarea) {
        System.out.println("La tarea ya se encuentra iniciada");
    }
    @Override
    public void finalizarTarea(Simple tarea) {
        System.out.println("La tarea ya se encuentra finalizada");
    }

}
