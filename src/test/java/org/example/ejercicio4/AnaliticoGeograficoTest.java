package org.example.ejercicio4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class AnaliticoGeograficoTest {

    private AnaliticoGeografico analiticoGeografico;
    private Tierra tierra;
    private Agua agua;
    private Pantano pantano;
    private Topografia topografiaMixta;
    private Topografia topografiaMixtaCompuesta;

    @BeforeEach
    public void setUp(){
        agua = new Agua();
        tierra = new Tierra();
        pantano = new Pantano();
        topografiaMixta = new Topografia(agua, agua, tierra, tierra);
        topografiaMixtaCompuesta = new Topografia(topografiaMixta, agua, tierra, tierra);
        analiticoGeografico  = new AnaliticoGeografico();
    }

    @Test
    public void calcularProporcionTest(){
        assertEquals(1,agua.getProporcionAgua());
        assertEquals(0, tierra.getProporcionAgua());
        assertEquals(0.7, pantano.getProporcionAgua());

        assertEquals(0.5, topografiaMixta.getProporcionAgua());

        assertEquals(0.375, topografiaMixtaCompuesta.getProporcionAgua());

    }

    @Test
    public void isEqualTest(){

        Topografia topografiaMixta2 = new Topografia(agua, tierra, agua, tierra);

        // ejercitacion del objeto previa para testear que por mas que la proporcion sea la misma, si la distribucion difiere no son iguales.
        assertTrue(topografiaMixta.getProporcionAgua() == topografiaMixta2.getProporcionAgua());
        assertTrue(!topografiaMixta.isEqual(topografiaMixta2));

        Topografia topografiaAgua = new Topografia(agua, agua, agua, agua);
        assertEquals(4, topografiaAgua.getComponentes().size());

        // testeo que al agregar un componente mas de los 4, no lo incorpora ni rompe la proporcion
//        topografiaAgua.agregarComponenteTopografico(agua);
        assertEquals(4, topografiaAgua.getComponentes().size());

        // testeo que por mas que la proporcion sea la misma, la topografiaAgua y agua no son iguales porque no tienen la misma distribucion
        assertTrue(!topografiaAgua.isEqual(agua));
    }

}
