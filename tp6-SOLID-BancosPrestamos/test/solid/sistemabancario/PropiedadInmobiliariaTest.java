package solid.sistemabancario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropiedadInmobiliariaTest {
    PropiedadInmobiliaria propiedadInmobiliaria;

    @BeforeEach
    void setUp() {
        propiedadInmobiliaria = new PropiedadInmobiliaria("Casa", "Calle Falsa 123", 100000);
    }

    @Test
    void getTaxValue() {
        double expectedTaxValue = 100000;
        double actualTaxValue = propiedadInmobiliaria.getTaxValue();
        assertEquals(expectedTaxValue, actualTaxValue);
    }
}