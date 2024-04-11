package org.example.ejercicio10;



import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
    private Proyecto proyecto;
    private Proyecto proyectoPrecio0;

    @BeforeEach
    public void setUp() throws Exception {
        this.proyecto = new Proyecto("Vacaciones de invierno", LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 25), "salir con amigos",3,1500.0);
        this.proyectoPrecio0 = new Proyecto("Vacaciones de invierno", LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 25), "salir con amigos",3,0.0);

    }

    @Test
    public void testAprobarEtapa() {
        assertTrue(this.proyecto.getEstado() instanceof EnConstruccion);
        this.proyecto.aprobarEtapa();
        assertTrue(this.proyecto.getEstado() instanceof EnEvaluacion);
        this.proyecto.aprobarEtapa();
        assertTrue(this.proyecto.getEstado() instanceof Confirmado);
        this.proyecto.aprobarEtapa();
        assertTrue(this.proyecto.getEstado() instanceof Confirmado);

        Exception exceptionPrecio0 = assertThrows(RuntimeException.class, () -> {this.proyectoPrecio0.aprobarEtapa();});
        assertEquals("El proyecto tiene precio 0, no puede aprobarse",exceptionPrecio0.getMessage());
    }

    @Test
    public void testCostoYPrecioDelProyecto() {
        assertEquals(45000.0,this.proyecto.costoDelProyecto());
        assertEquals(48150.0,this.proyecto.precioDelProyecto());

        assertEquals(0,this.proyectoPrecio0.costoDelProyecto());
        assertEquals(0,this.proyectoPrecio0.precioDelProyecto());
    }

    @Test
    public void testModificarMargenDeGanancias() {
        // proyecto en construccion, fuera de rango margen y dentro de rango
        this.proyecto.modificarMargenGanancia(0.12);
        assertEquals(48150.0,this.proyecto.precioDelProyecto());
        this.proyecto.modificarMargenGanancia(0.10);
        assertEquals(49500.00000000001,this.proyecto.precioDelProyecto());// es 49500 pero tiene error de redondeo

        //proyecto en evaluacion, fuera del rango margen y dentro de rango
        this.proyecto.aprobarEtapa();
        this.proyecto.modificarMargenGanancia(0.16);
        assertEquals(49500.00000000001,this.proyecto.precioDelProyecto());// es 49500 pero tiene error de redondeo
        this.proyecto.modificarMargenGanancia(0.11);
        assertEquals(49950.00000000001,this.proyecto.precioDelProyecto());// es 49950 pero tiene error de redondeo
        this.proyecto.modificarMargenGanancia(0.15);
        assertEquals(51749.99999999999,this.proyecto.precioDelProyecto());// es 51750 pero tiene error de redondeo

        this.proyecto.aprobarEtapa();
        this.proyecto.modificarMargenGanancia(0.10);
        assertEquals(51749.99999999999,this.proyecto.precioDelProyecto()); // es 51750 pero tiene error de redondeo
    }

    @Test
    public void testCancelarProyecto() {
        this.proyecto.cancelarProyecto();
        assertEquals("salir con amigos - CANCELADO",this.proyecto.getObjetivo());
        this.proyecto.cancelarProyecto();
        assertEquals("salir con amigos - CANCELADO",this.proyecto.getObjetivo());
    }

}

