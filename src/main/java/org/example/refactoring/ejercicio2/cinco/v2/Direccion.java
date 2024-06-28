package org.example.refactoring.ejercicio2.cinco.v2;

public class Direccion {
    public String localidad;
    public String calle;
    public String numero;
    public String departamento;

    @Override
    public String toString(){
        return this.localidad + "," +
                this.calle + ","+
                this.numero + ","+
                this.departamento;
    }

}
