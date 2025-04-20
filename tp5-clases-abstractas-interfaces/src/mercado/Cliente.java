package mercado;

import mercado.productos.Producto;
import mercado.servicios.Factura;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private Caja caja;

    public Cliente(String nombre, Caja caja) {
        this.nombre = nombre;
        this.caja = caja;
    }

    public double comprarProductos(ArrayList<Producto> productos) {
        caja.registrarProductos(productos);
        return caja.getMontoAPagar();
    }

    public double pagarFactura(Factura factura) {
        caja.registrarPago(factura);
        return caja.getMontoAPagar();
    }
}
