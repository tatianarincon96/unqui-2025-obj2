package mercado;

import mercado.productos.Producto;
import mercado.productos.ProductoDeEmpresaTradicional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductoDeEmpresaTradicionalTest {
    Producto productoDeEmpresaTradicional;

    @BeforeEach
    void setUp() {
        productoDeEmpresaTradicional = new ProductoDeEmpresaTradicional("Huevos", 1000.0);
    }

    @Test
    void getNombre() {
        assertEquals("Huevos", productoDeEmpresaTradicional.getNombre());
    }

    @Test
    void getPrecio() {
        assertEquals(1000.0, productoDeEmpresaTradicional.getCosto());
    }

    @Test
    void setPrecio() {
        assertEquals(1000.0, productoDeEmpresaTradicional.getCosto());
        productoDeEmpresaTradicional.setPrecio(1500.0);
        assertEquals(1500.0, productoDeEmpresaTradicional.getCosto());
    }
}