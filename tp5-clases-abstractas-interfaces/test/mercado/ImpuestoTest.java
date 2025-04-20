package mercado;

import mercado.servicios.Impuesto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpuestoTest {
    Impuesto impuesto;

    @BeforeEach
    void setUp() {
        impuesto = new Impuesto(150);
    }

    @Test
    void getCosto() {
        assertEquals(150, impuesto.getCosto());
    }
}