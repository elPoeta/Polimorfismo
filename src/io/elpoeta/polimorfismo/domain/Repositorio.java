package io.elpoeta.polimorfismo.domain;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author elPoeta
 */
public class Repositorio {

    private List<Producto> productos;
    private StringBuilder salidaPorPantalla;

    public Repositorio() {
        this.cargar();
        this.salidaPorPantalla = new StringBuilder();
        this.salidaDatos();
    }

    private void cargar() {
        productos = Arrays.asList(new Bebida("Coca-Cola Zero", new BigDecimal(20), 1.5),
                new Bebida("Coca-Cola", new BigDecimal(18), 1.5),
                new Shampoo("Shampoo Sedal", new BigDecimal(19), 500),
                new Fruta("Frutillas", new BigDecimal(64), "Kilo"));
    }

    private void ordenar() {
        Collections.sort(productos);
    }

    private void salidaDatos() {

        for (Producto p : productos) {
            salidaPorPantalla.append(p);
            salidaPorPantalla.append("\n");
        }
        this.ordenar();
        salidaPorPantalla.append("===============================\n");
        salidaPorPantalla.append("Producto más caro: " + productos.get(0).getNombre() + "\n");
        salidaPorPantalla.append("Producto más barato: " + productos.get(productos.size() - 1).getNombre());

    }

    @Override
    public String toString() {
        return salidaPorPantalla.toString();
    }
}
