package io.elpoeta.polimorfismo.domain;

import java.math.BigDecimal;

/**
 *
 * @author elPoeta
 */
public abstract class Producto implements Comparable<Producto> {

    private String nombre;
    private BigDecimal precio;

    public Producto(String nombre, BigDecimal precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto p) {
        return p.precio.compareTo(this.precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Precio: $" + precio.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

}
