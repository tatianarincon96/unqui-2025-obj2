package mercado;

public abstract class Producto {
    protected String nombre;
    protected double precio;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    protected void setPrecio(double precio) {
        this.precio = precio;
    }
}
