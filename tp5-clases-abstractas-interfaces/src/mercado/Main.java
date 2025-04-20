package mercado;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un mercado
        Mercado mercado = new Mercado("Supermercado Chino");

        // Crear productos
        Producto leche = new ProductoDeCooperativa("Leche", 1150.50);
        Producto pan = new ProductoDeEmpresaTradicional("Pan", 100.80);
        Producto huevos = new ProductoDeEmpresaTradicional("Huevos", 2100.00);

        // Agregar productos al mercado
        mercado.aumentarStock(leche);
        mercado.aumentarStock(pan);
        mercado.aumentarStock(huevos);

        // Mostrar stock
        System.out.println("Stock inicial:");
        for (Producto producto : mercado.getStockProductos().keySet()) {
            System.out.println(producto.getNombre() + ": " + mercado.getStockProductos().get(producto));
        }

        System.out.println("---------------------------------------------");

        // Crear una caja
        Caja caja = new Caja(mercado);

        // Crear un cliente
        Cliente cliente = new Cliente("Juan", caja);

        // mercado.Cliente compra productos
        ArrayList<Producto> productosAComprar = new ArrayList<>();
        productosAComprar.add(leche);
        productosAComprar.add(pan);

        cliente.comprar(productosAComprar);

        System.out.println("---------------------------------------------");

        // Mostrar stock después de la compra
        System.out.println("Stock después de la compra:");
        for (Producto producto : mercado.getStockProductos().keySet()) {
            System.out.println(producto.getNombre() + ": " + mercado.getStockProductos().get(producto));
        }
    }
}
