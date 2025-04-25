package solid.sistemabancario.creditos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solid.sistemabancario.Cliente;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CreditoPersonalTest {
    CreditoPersonal creditoPersonal;

    @BeforeEach
    void setUp() {
        Cliente cliente = new Cliente("Juan", "Pérez", "Calle Falsa 123", LocalDate.of(1996,05,04), 200000);
        creditoPersonal = new CreditoPersonal(cliente, 50000, 10);
    }

    @Test
    void isApplicable() {
        creditoPersonal.isApplicable();
        assertTrue(creditoPersonal.isAccepted());
    }
}