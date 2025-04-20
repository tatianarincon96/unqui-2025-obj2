package mercado;

import mercado.productos.Producto;
import mercado.productos.ProductoDeCooperativa;
import mercado.productos.ProductoDeEmpresaTradicional;
import mercado.servicios.Factura;
import mercado.servicios.Servicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CajaTest {
    Mercado mercado;
    Agencia agenciaRecaudadora;
    Producto leche;
    Producto pan;

    @BeforeEach
    void setUp() {
        mercado = new Mercado("Mercado Test");
        agenciaRecaudadora = new AgenciaRecaudadora();
        leche = new ProductoDeCooperativa("Leche", 100.0);
        pan = new ProductoDeEmpresaTradicional("Pan", 20.0);
        mercado.aumentarStock(leche);
        mercado.aumentarStock(pan);
    }

    @Test
    void registrarProductos() {
        Caja caja = new Caja(mercado, agenciaRecaudadora);

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(leche);

        caja.registrarProductos(productos);
        assertEquals(90.0, caja.getMontoAPagar());
        assertEquals(0, mercado.getStockProductos().get(leche));
    }

    @Test
    void registrarPago() {
        Caja caja = new Caja(mercado, agenciaRecaudadora);

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(leche);
        caja.registrarProductos(productos);

        Factura factura = new Servicio(100, 4);
        caja.registrarPago(factura);

        assertEquals(90.0 + 400.0, caja.getMontoAPagar());
    }
}