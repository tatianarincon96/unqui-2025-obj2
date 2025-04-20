package mercado.productos;

public class ProductoDeCooperativa extends Producto {

    public ProductoDeCooperativa(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double getCosto() {
        return precio * 0.9;
    }
}
