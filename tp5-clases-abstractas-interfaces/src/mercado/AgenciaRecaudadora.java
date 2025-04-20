package mercado;

import mercado.servicios.Factura;

import java.util.ArrayList;

public class AgenciaRecaudadora implements Agencia {
    private ArrayList<Factura> facturas;

    public AgenciaRecaudadora() {
        this.facturas = new ArrayList<>();
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    @Override
    public void registrarPago(Factura factura) {
        facturas.add(factura);
    }
}
