package org.example.ejercicio14;

import java.util.List;

public interface DataBaseAccess {
    public Integer insertNewRow(List<String> rowData);
    public List<String> getSearchResult(String query);
}
