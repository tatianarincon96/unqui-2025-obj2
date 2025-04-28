package solid.sistemabancario.creditos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solid.sistemabancario.Cliente;
import solid.sistemabancario.PropiedadInmobiliaria;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CreditoHipotecarioTest {
    CreditoHipotecario creditoHipotecario;

    @BeforeEach
    void setUp() {
        Cliente cliente = new Cliente("Juan", "Pérez", "Calle Falsa 123", LocalDate.of(1990, 1, 1), 100000);
        creditoHipotecario = new CreditoHipotecario(cliente, 500000, 60, new PropiedadInmobiliaria("Casa", "Calle Falsa 123", 700000));
    }

    @Test
    void isApplicable() {
        creditoHipotecario.isApplicable();
        assertFalse(creditoHipotecario.isAccepted());
    }
}