package org.example.refactoring.ejercicio1tres;

import java.util.List;

public class Ejercicio1tres {

    List<Empleado> personal;
    public void imprimirValores() {
        int totalEdades = 0;
        double promedioEdades = 0;
        double totalSalarios = 0;

        for (Empleado empleado : personal) {
            totalEdades = totalEdades + empleado.getEdad();
            totalSalarios = totalSalarios + empleado.getSalario();
        }
        promedioEdades = totalEdades / personal.size();

        String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);

        System.out.println(message);

    }


    // replace temp with query -> se reeempalzan las variables temporarias con metodos que retornan el valor a utilizar.
    // reinventa la rueda -> se itera sobre una coleccion con acumuladores , cuando se podrian utilizar streams para resolver el calculo.


    public void imprimirValores1() {
        String message = String.format("El promedio de las edades es %s y el total de salarios es %s", this.getPromedioEdades(), this.getTotalSalarios());

        System.out.println(message);

    }

    private double getTotalEdades(){
        return personal.stream().mapToInt(Empleado::getEdad).sum();
    }
    private double getTotalSalarios(){
        return personal.stream().mapToDouble(Empleado::getSalario).sum();
    }
    private double getPromedioEdades(){
        return this.getTotalEdades()/this.personal.size();
    }



}
