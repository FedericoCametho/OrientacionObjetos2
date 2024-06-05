package org.example.parcial2;


import java.time.LocalDateTime;

public interface Estado {

    public abstract long getDuracionTotal(LocalDateTime fechaInicio, LocalDateTime fechaFin);

    public abstract void iniciarTarea(Simple tarea);

    public abstract void finalizarTarea(Simple tarea);
}
