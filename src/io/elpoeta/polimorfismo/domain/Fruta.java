package io.elpoeta.polimorfismo.domain;

import java.math.BigDecimal;

/**
 *
 * @author elPoeta
 */
public class Fruta extends Producto {

    private String unidadDeVenta;

    public Fruta(String nombre, BigDecimal precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return super.toString() + " /// Unidad de Venta: " + unidadDeVenta;
    }
}
