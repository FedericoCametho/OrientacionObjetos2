package org.example.parcial1;

import org.example.parcial1.promocion.Promocion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Persona {

    private List<Vehiculo> vehiculos;
    private Promocion promocion;
    private LocalDate fechaNacimiento;

    public Persona(List<Vehiculo> vehiculos, Promocion promocion, LocalDate fechaNacimiento) {
        this.vehiculos = vehiculos;
        this.promocion = promocion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public long getEdad() {
        return ChronoUnit.YEARS.between(this.fechaNacimiento, LocalDate.now());
    }


    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    private Double calcularTotalPolizasSinPromo(){
        return this.vehiculos.stream().mapToDouble(vehiculo -> vehiculo.getSeguro().getImporteTotalSeguro(vehiculo, this)).sum();
    }

    public Double calcularImportePolizas(){
        return this.calcularTotalPolizasSinPromo() - this.promocion.calcularDescuentoPromo(this.vehiculos,this );
    }
}
