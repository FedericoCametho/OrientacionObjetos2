package org.example.parcial1.seguro;

import org.example.parcial1.Persona;
import org.example.parcial1.Vehiculo;

public abstract class Seguro {

    private Double BASE_SEGURO_CONDUCTOR = 100.00;
    public Double coberturaDeVida(Vehiculo vehiculo, Persona persona){
        return this.getSeguroConductor(persona.getEdad()) + this.coberturaDeVidaExtra( vehiculo,  persona);
    }
    public abstract Double coberturaDeDanosTerceros(Vehiculo vehiculo, Persona persona);
    public Double coberturaDanosPropios(Vehiculo vehiculo){
        return 0.5 * vehiculo.getValor() + this.coberturaDanosPropiosExtra(vehiculo);
    }
    public abstract Double coberturaDeVidaExtra(Vehiculo vehiculo, Persona persona);

    public abstract Double coberturaDanosPropiosExtra(Vehiculo vehiculo);

    public Double getSeguroConductor(long edad){
        return this.BASE_SEGURO_CONDUCTOR * edad;
    }

    public Double getImporteTotalSeguro(Vehiculo vehiculo, Persona persona){
        Double vida = this.coberturaDeVida(vehiculo, persona);
        Double propio = this.coberturaDanosPropios(vehiculo);
        Double terceros = this.coberturaDeDanosTerceros(vehiculo, persona);
        return vida + propio + terceros;
    }


}
