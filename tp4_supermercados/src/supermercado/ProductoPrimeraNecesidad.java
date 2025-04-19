package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
    private double descuento;

    public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
        super(nombre, precio);
        this.descuento = descuento;
    }

    public ProductoPrimeraNecesidad(String nombre, double precio, boolean esParteDePreciosCuidados, double descuento) {
        super(nombre, precio, esParteDePreciosCuidados);
        this.descuento = descuento;
    }

    @Override
    public double getPrecio() {
        // Se aplica descuento variable
        double precioConDescuento = super.getPrecio() * (1 - descuento);
        String format = String.format("%.2f", precioConDescuento);
        return Double.parseDouble(format);
    }
}
