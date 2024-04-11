package org.example.ejercicio6;

public class Planta extends Empleado{

    private static double baseFija = 50000;
    private int antiguedad;
    public Planta(String nombre, String dni, boolean casado, int hijos, int antiguedad){
        super(nombre, dni, baseFija, casado, hijos);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }



    @Override
    public Double calcularAdicional() {
        return super.calcularAdicional() + 2000.0 * this.antiguedad;
    }


}
