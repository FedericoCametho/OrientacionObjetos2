package org.example.refactoring.ejercicio2.cuatro.v2;

import java.util.List;

public class Carrito {
    private List<ItemCarrito> items;

    public double getPrecioTotalCarrito() {
        return this.items.stream().mapToDouble(ItemCarrito::getPrecioItemCarrito).sum();
    }


}
