package supermercado;

public class Producto {
    private String nombre;
    private double precio;
    private boolean esPrecioCuidado;

    public Producto(String nombre, double precio, boolean esPrecioCuidado) {
        this.nombre = nombre;
        this.precio = precio;
        this.esPrecioCuidado = esPrecioCuidado;
    }

    // Si no se especifica el tercer parámetro, se asume que no es parte del programa de precios cuidados
    public Producto(String nombre, double precio) {
        this(nombre, precio, false);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    protected void aumentarPrecio(double aumento) {
        this.precio += aumento;
    }

    public boolean esPrecioCuidado() {
        return esPrecioCuidado;
    }
}
