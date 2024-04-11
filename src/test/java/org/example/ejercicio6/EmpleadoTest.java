package org.example.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

    private Empleado temporario;
    private Empleado pasante;
    private Empleado planta;

    @BeforeEach
    void setUp() throws Exception {
        temporario = new Temporario("Fede", "111",8,true,2);
        pasante = new Pasante("Agus", "222", 2);
        planta = new Planta("Jose", "333",true,2,8);
    }

    @Test
    void testDescuento() {
        assertEquals(2912+450,this.temporario.calcularDescuento());
        assertEquals(2600+200,this.pasante.calcularDescuento());
        assertEquals(6500+1250,this.planta.calcularDescuento());
    }

    @Test
    public void testCalcularBasico(){
        assertEquals(22400.00, this.temporario.calcularBasico());
        assertEquals(20000.00, this.pasante.calcularBasico());
        assertEquals(50000.00, this.planta.calcularBasico());
    }

    @Test
    public void testCalcularAdicional(){
        assertEquals(9000.00, this.temporario.calcularAdicional());
        assertEquals(4000.00, this.pasante.calcularAdicional());
        assertEquals(25000.00, this.planta.calcularAdicional());
    }

    @Test
    void testSueldo() {
        assertEquals(22400+9000-(2912+450),this.temporario.calcularSueldo());
        assertEquals(20000+4000-(2600+200),this.pasante.calcularSueldo());
        assertEquals(50000+25000-(6500+1250),this.planta.calcularSueldo());
    }


}
