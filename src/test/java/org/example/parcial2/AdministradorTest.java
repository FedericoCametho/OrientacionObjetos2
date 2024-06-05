package org.example.parcial2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AdministradorTest {
    private Simple supermerado;
    private Simple verduleria;
    private Simple cocinar;
    private Simple prepararLaMesa;
    private Compleja realizarComprasCompleja;
    private Compleja target;


    @BeforeEach
    void setUp() throws Exception {
        supermerado = new Simple("Ir al super","A comprar verdura", 3);
        verduleria = new Simple("ir a la verduleria", "a comprar verdura", 1);
        cocinar = new Simple("Cocinar","para comer", 2);
        prepararLaMesa = new Simple("preparar la mesa","para sentarse",1);
        realizarComprasCompleja = new Compleja("realizar compra","comprar");
        this.realizarComprasCompleja.agregarTarea(this.supermerado);
        this.realizarComprasCompleja.agregarTarea(this.verduleria);
        target = new Compleja("preparar almuerzo","para comer");
        this.target.agregarTarea(this.cocinar);
        this.target.agregarTarea(this.prepararLaMesa);
        this.target.agregarTarea(this.realizarComprasCompleja);

        this.realizarComprasCompleja.iniciarTarea();

        this.supermerado.finalizarTarea();
        this.supermerado.setFechaFin(LocalDateTime.of(2024,6,5,21,30));


        this.verduleria.finalizarTarea();
        this.verduleria.setFechaFin(LocalDateTime.of(2024,6,5,20,30));


        this.prepararLaMesa.iniciarTarea();

    }

    @Test
    public void getAvanceTareaTest(){
        double expected = 0.42857142857142857142857142857143;
        assertEquals(expected,this.target.getAvanceTarea());
    }

}
