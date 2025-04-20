package mercado.servicios;

public class Servicio extends Factura {
    private double costoPorUnidadConsumida;
    private int cantUnidadesConsumidas;

    public Servicio(double costoPorUnidadConsumida, int cantUnidadesConsumidas) {
        this.costoPorUnidadConsumida = costoPorUnidadConsumida;
        this.cantUnidadesConsumidas = cantUnidadesConsumidas;
    }

    @Override
    public double getCosto() {
        return this.costoPorUnidadConsumida * this.cantUnidadesConsumidas;
    }
}
