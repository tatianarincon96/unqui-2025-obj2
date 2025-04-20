package mercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CajaTest {
    Mercado mercado;
    Producto leche;
    Producto pan;

    @BeforeEach
    void setUp() {
        mercado = new Mercado("Mercado Test");
        leche = new ProductoDeCooperativa("Leche", 100.0);
        pan = new ProductoDeEmpresaTradicional("Pan", 20.0);
        mercado.aumentarStock(leche);
        mercado.aumentarStock(pan);
    }

    @Test
    void registrarProductosEInformarMontoAPagar() {
        Caja caja = new Caja(mercado);

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(leche);

        caja.registrarProductos(productos);
        assertEquals(90.0, caja.informarMontoYLimpiarCaja());
        assertEquals(0, mercado.getStockProductos().get(leche));
    }
}