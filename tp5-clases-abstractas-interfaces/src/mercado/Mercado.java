package mercado;

import java.util.HashMap;
import java.util.Map;

public class Mercado {
    private String nombre;
    private Map<Producto, Integer> stockProductos;

    public Mercado(String nombre) {
        this.nombre = nombre;
        this.stockProductos = new HashMap<>();
    }

    public Map<Producto, Integer> getStockProductos() {
        return stockProductos;
    }

    public void aumentarStock(Producto producto) {
        stockProductos.put(producto, stockProductos.getOrDefault(producto, 0) + 1);
    }

    public void reducirStock(Producto producto) {
        stockProductos.put(producto, stockProductos.get(producto) - 1);
    }
}
