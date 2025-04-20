package mercado;

import mercado.servicios.Servicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicioTest {
    Servicio servicio;

    @BeforeEach
    void setUp() {
        servicio = new Servicio(10, 5);
    }

    @Test
    void getCosto() {
        assertEquals(50, servicio.getCosto());
    }
}