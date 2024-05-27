package org.example.ejercicio15;

import java.time.LocalDateTime;
import java.util.List;

public class Archive {
    private String name;
    private String extention;
    private Integer size;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;
    private List<Permit> permitList;

    public String prettyPrint(PrintStrategy printStrategy){
       return printStrategy.print(this);
    }

    public String getName() {
        return name;
    }

    public String getExtention() {
        return extention;
    }

    public Integer getSize() {
        return size;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getModificationDate() {
        return modificationDate;
    }

    public List<Permit> getPermitList() {
        return permitList;
    }
}
