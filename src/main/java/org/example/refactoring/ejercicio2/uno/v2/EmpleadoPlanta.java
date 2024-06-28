package org.example.refactoring.ejercicio2.uno.v2;

public class EmpleadoPlanta extends EmpleadoConHijos{

    private static double VALOR_PLUS_POR_HIJO = 2000;
    public EmpleadoPlanta(String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
        super(nombre, apellido, sueldoBasico, cantidadHijos);
    }

    @Override
    protected double calcularSueldoEspecifico() {
            return this.sueldoBasico + (this.cantidadHijos * VALOR_PLUS_POR_HIJO);
    }


}
