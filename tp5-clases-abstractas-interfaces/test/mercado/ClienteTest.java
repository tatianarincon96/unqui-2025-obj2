package mercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
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
    void comprar() {
        Caja caja = new Caja(mercado);
        Cliente cliente = new Cliente("Juan", caja);

        // Cliente compra productos
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(pan);
        productos.add(huevos);

        // Verificar monto a pagar
        assertEquals(30.0, cliente.comprar(productos));
    }
}