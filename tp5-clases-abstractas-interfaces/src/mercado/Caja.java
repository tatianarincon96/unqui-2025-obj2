package mercado;

import mercado.productos.Producto;
import mercado.servicios.Factura;

import java.util.ArrayList;

public class Caja {
    private Mercado mercado;
    private Agencia agenciaRecaudadora;
    private double montoAPagar;

    public Caja(Mercado mercado, Agencia agenciaRecaudadora) {
        this.mercado = mercado;
        this.agenciaRecaudadora = agenciaRecaudadora;
        this.montoAPagar = 0;
    }

    public void registrarProductos(ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            montoAPagar += producto.getCosto();
            mercado.reducirStock(producto);
        }
    }

    public void registrarPago(Factura factura) {
        montoAPagar += factura.getCosto();
        agenciaRecaudadora.registrarPago(factura);
    }

    public double getMontoAPagar() {
        return montoAPagar;
    }
}
