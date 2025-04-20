package mercado;

public class ProductoDeCooperativa extends Producto {

    public ProductoDeCooperativa(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio * 0.9;
    }
}
