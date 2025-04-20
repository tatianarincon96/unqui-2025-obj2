package mercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoDeCooperativaTest {
    Producto productoDeCooperativa;

    @BeforeEach
    void setUp() {
        productoDeCooperativa = new ProductoDeCooperativa("Leche", 100.0);
    }

    @Test
    void getNombre() {
        assertEquals("Leche", productoDeCooperativa.getNombre());
    }

    @Test
    void getPrecio() {
        assertEquals(90.0, productoDeCooperativa.getPrecio());
    }

    @Test
    void setPrecio() {
        assertEquals(90.0, productoDeCooperativa.getPrecio());
        productoDeCooperativa.setPrecio(120.0);
        assertEquals(108.0, productoDeCooperativa.getPrecio());
    }
}