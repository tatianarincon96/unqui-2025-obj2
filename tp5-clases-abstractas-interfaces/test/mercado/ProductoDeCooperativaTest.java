package mercado;

import mercado.productos.Producto;
import mercado.productos.ProductoDeCooperativa;
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
        assertEquals(90.0, productoDeCooperativa.getCosto());
    }

    @Test
    void setPrecio() {
        assertEquals(90.0, productoDeCooperativa.getCosto());
        productoDeCooperativa.setPrecio(120.0);
        assertEquals(108.0, productoDeCooperativa.getCosto());
    }
}