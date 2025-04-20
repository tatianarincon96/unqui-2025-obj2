package mercado;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private Caja caja;

    public Cliente(String nombre, Caja caja) {
        this.nombre = nombre;
        this.caja = caja;
    }

    public double comprar(ArrayList<Producto> productos) {
        caja.registrarProductos(productos);
        double montoAPagar = caja.informarMontoYLimpiarCaja();
        System.out.println("El monto a pagar por " + nombre + " es: " + montoAPagar);
        return montoAPagar;
    }
}
