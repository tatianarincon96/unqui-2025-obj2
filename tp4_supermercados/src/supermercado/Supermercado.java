package supermercado;

import java.util.ArrayList;

public class Supermercado {
    private String nombre;
    private String direccion;
    private ArrayList<Producto> productos;


    public Supermercado(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public int getCantidadDeProductos() {
        return this.productos.size();
    }

    public double getPrecioTotal() {
        return productos.stream().reduce(0d, (total, producto) -> total + producto.getPrecio(), Double::sum);
    }
}
