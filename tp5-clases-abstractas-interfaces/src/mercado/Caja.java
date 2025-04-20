package mercado;

import java.util.ArrayList;

public class Caja {
    private Mercado mercado;
    private double montoAPagar;

    public Caja(Mercado mercado) {
        this.mercado = mercado;
        this.montoAPagar = 0;
    }

    public void registrarProductos(ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            montoAPagar += producto.getPrecio();
            mercado.reducirStock(producto);
        }
    }

    private void setMontoAPagar(double montoAPagar) {
        this.montoAPagar = montoAPagar;
    }

    private double getMontoAPagar() {
        return montoAPagar;
    }

    public double informarMontoYLimpiarCaja() {
        double montoTotal = getMontoAPagar();
        setMontoAPagar(0);
        return montoTotal;
    }
}
