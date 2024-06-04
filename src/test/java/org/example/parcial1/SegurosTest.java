package org.example.parcial1;

import org.example.parcial1.promocion.SinPromocion;
import org.example.parcial1.seguro.Terceros;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class SegurosTest {

    private Persona persona;
    private List<Vehiculo> vehiculoList;
    private Vehiculo renaut11;
    private Vehiculo renaultClio;
    @BeforeEach
    public void setUp(){
        this.renaut11 = new Vehiculo(4, 680000.00,new Terceros(), LocalDate.of(1988,1,1));
        this.renaultClio = new Vehiculo(5, 1200000.00, new Terceros(), LocalDate.of(2001,1,1));
        this.vehiculoList = Arrays.asList(this.renaultClio, this.renaut11);
        this.persona = new Persona(this.vehiculoList, new SinPromocion(), LocalDate.of(1974,1,1));
    }

    @Test
    public void calcularImportePolizasTest(){
        // costo del seguro de vida = 5000 + 5000 = 10000
        // costo cobertura danos = 1000 +1000++6800 + 12000 = 20800
        //costo cobertura danos propios =  340000+600000 = 940000
        // costo total sin promo = 970800
        Double expected = 970800.00;
        Assertions.assertEquals(expected, this.persona.calcularImportePolizas());
    }

}
