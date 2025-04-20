package mercado;

import mercado.productos.Producto;
import mercado.productos.ProductoDeCooperativa;
import mercado.productos.ProductoDeEmpresaTradicional;
import mercado.servicios.Factura;
import mercado.servicios.Impuesto;
import mercado.servicios.Servicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    Mercado mercado;
    Agencia agenciaRecaudadora;
    Producto leche;
    Producto pan;
    Producto huevos;

    @BeforeEach
    void setUp() {
        mercado = new Mercado("Mercado Test");
        agenciaRecaudadora = new AgenciaRecaudadora();
        leche = new ProductoDeCooperativa("Leche", 100.0);
        pan = new ProductoDeEmpresaTradicional("Pan", 20.0);
        huevos = new ProductoDeEmpresaTradicional("Huevos", 10.0);
        mercado.aumentarStock(leche);
        mercado.aumentarStock(pan);
        mercado.aumentarStock(huevos);
    }

    @Test
    void comprarProductos() {
        Caja caja = new Caja(mercado, agenciaRecaudadora);
        Cliente cliente = new Cliente("Juan", caja);

        // Cliente compra productos
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(pan);
        productos.add(huevos);

        // Verificar monto a pagar
        assertEquals(30.0, cliente.comprarProductos(productos));
    }

    @Test
    void pagarServicio() {
        Caja caja = new Caja(mercado, agenciaRecaudadora);
        Cliente cliente = new Cliente("Juan", caja);

        // Cliente paga un servicio
        Factura factura = new Servicio(100, 4);
        cliente.pagarFactura(factura);

        // Verificar monto a pagar
        assertEquals(400.0, caja.getMontoAPagar());
    }

    @Test
    void comprarProductosYPagarImpuesto() {
        Caja caja = new Caja(mercado, agenciaRecaudadora);
        Cliente cliente = new Cliente("Juan", caja);

        // Cliente compra productos
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(leche);
        productos.add(pan);

        cliente.comprarProductos(productos);
        // Agregar impuesto
        Factura impuesto = new Impuesto(20.0);
        cliente.pagarFactura(impuesto);

        // Verificar monto a pagar con impuesto
        assertEquals(130.0, caja.getMontoAPagar());
    }
}