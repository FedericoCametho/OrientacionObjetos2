package org.example.ejercicio5;


import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystem{

    private List<FileSystem> contenido;

    public Directorio(String nombre, LocalDate fecha){
        super(nombre, fecha);
        this.contenido = new ArrayList<FileSystem>();
    }

    public void agregar(FileSystem file){
        this.contenido.add(file);
    }


    @Override
    public int tamanoTotalOcupado(){
        return this.contenido.stream().mapToInt( file -> file.tamanoTotalOcupado()).sum() + 32;
    }

    @Override
    public Archivo archivoMasGrande() {
        return this.contenido.stream().map(file  -> file.archivoMasGrande())
                        .max((a1, a2) -> Integer.compare(a1.tamanoTotalOcupado(), a2.tamanoTotalOcupado())).orElse(null);
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this.contenido.stream().map(file -> file.archivoMasNuevo())
                .max((a1, a2) -> a1.getFecha().compareTo(a2.getFecha())).orElse(null);
    }


}
