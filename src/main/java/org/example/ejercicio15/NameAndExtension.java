package org.example.ejercicio15;

public class NameAndExtension implements PrintStrategy{

    @Override
    public String print(Archive archive) {
        return archive.getName()+" - "+archive.getExtention();
    }
}
