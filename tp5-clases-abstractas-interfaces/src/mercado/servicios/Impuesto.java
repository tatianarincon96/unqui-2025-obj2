package mercado.servicios;

public class Impuesto extends Factura {
    private double tasaServicio;

    public Impuesto(double tasaServicio) {
        this.tasaServicio = tasaServicio;
    }

    @Override
    public double getCosto() {
        return this.tasaServicio;
    }
}
