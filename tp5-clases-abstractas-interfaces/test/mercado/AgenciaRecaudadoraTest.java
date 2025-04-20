package mercado;

import mercado.servicios.Factura;
import mercado.servicios.Servicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgenciaRecaudadoraTest {
    AgenciaRecaudadora agenciaRecaudadora;

    @BeforeEach
    void setUp() {
        agenciaRecaudadora = new AgenciaRecaudadora();
    }

    @Test
    void registrarPago() {
        Factura factura = new Servicio(100, 4);
        agenciaRecaudadora.registrarPago(factura);
        assertTrue(agenciaRecaudadora.getFacturas().contains(factura));
    }
}