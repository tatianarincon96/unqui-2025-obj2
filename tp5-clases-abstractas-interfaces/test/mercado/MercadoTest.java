package mercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MercadoTest {
    Mercado mercado;
    Producto leche;
    Producto pan;
    Producto huevos;

    @BeforeEach
    void setUp() {
        mercado = new Mercado("Mercado Test");
        leche = new ProductoDeCooperativa("Leche", 100.0);
        pan = new ProductoDeEmpresaTradicional("Pan", 20.0);
        huevos = new ProductoDeEmpresaTradicional("Huevos", 10.0);
        mercado.aumentarStock(leche);
        mercado.aumentarStock(pan);
        mercado.aumentarStock(huevos);
    }

    @Test
    void getStockProductos() {
        // Verificar que el stock inicial es correcto
        assertEquals(1, mercado.getStockProductos().get(leche));
        assertEquals(1, mercado.getStockProductos().get(pan));
        assertEquals(1, mercado.getStockProductos().get(huevos));
    }

    @Test
    void aumentarStock() {
        // Aumentar el stock de leche
        mercado.aumentarStock(leche);
        assertEquals(2, mercado.getStockProductos().get(leche));

        // Aumentar el stock de pan
        mercado.aumentarStock(pan);
        assertEquals(2, mercado.getStockProductos().get(pan));

        // Aumentar el stock de huevos
        mercado.aumentarStock(huevos);
        assertEquals(2, mercado.getStockProductos().get(huevos));
    }

    @Test
    void reducirStock() {
        // Reducir el stock de leche
        mercado.reducirStock(leche);
        assertEquals(0, mercado.getStockProductos().get(leche));

        // Reducir el stock de pan
        mercado.reducirStock(pan);
        assertEquals(0, mercado.getStockProductos().get(pan));

        // Reducir el stock de huevos
        mercado.reducirStock(huevos);
        assertEquals(0, mercado.getStockProductos().get(huevos));
    }
}