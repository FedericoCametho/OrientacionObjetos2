package org.example.ejercicio5;

import java.time.LocalDate;

public abstract class FileSystem {

    protected String nombre;
    protected LocalDate fecha;
    public FileSystem(String nombre, LocalDate fecha){
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract int tamanoTotalOcupado();

    public abstract Archivo archivoMasGrande();

    public abstract Archivo archivoMasNuevo();

}
