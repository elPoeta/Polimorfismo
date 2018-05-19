package io.elpoeta.polimorfismo.domain;

import java.math.BigDecimal;

/**
 *
 * @author elPoeta
 */
public class Bebida extends Producto {

    private double litros;

    public Bebida(String nombre, BigDecimal precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " /// Litros: " + litros + " /// " + "Precio: $" + super.getPrecio();
    }
}
