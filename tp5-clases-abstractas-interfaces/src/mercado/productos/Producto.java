package mercado.productos;

import mercado.Pagable;

public abstract class Producto implements Pagable {
    protected String nombre;
    protected double precio;

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
