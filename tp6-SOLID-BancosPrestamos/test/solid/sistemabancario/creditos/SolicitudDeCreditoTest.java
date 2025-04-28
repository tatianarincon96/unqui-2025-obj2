package solid.sistemabancario.creditos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solid.sistemabancario.Cliente;
import solid.sistemabancario.PropiedadInmobiliaria;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SolicitudDeCreditoTest {
    CreditoHipotecario creditoHipotecario;
    CreditoPersonal creditoPersonal;

    @BeforeEach
    void setUp() {
        Cliente cliente = new Cliente("Juan", "Pérez", "Calle Falsa 123", LocalDate.of(1990, 1, 1), 100000);
        creditoHipotecario = new CreditoHipotecario(cliente, 500000, 60, new PropiedadInmobiliaria("Casa", "Calle Falsa 123", 700000));
        creditoPersonal = new CreditoPersonal(cliente, 50000, 10);
    }

    @Test
    void getClient() {
        assertEquals(creditoHipotecario.getClient(), creditoHipotecario.client);
        assertEquals(creditoPersonal.getClient(), creditoPersonal.client);
    }

    @Test
    void isAccepted() {
        creditoHipotecario.isApplicable();
        assertFalse(creditoHipotecario.isAccepted());
        creditoPersonal.isApplicable();
        assertTrue(creditoPersonal.isAccepted());
    }

    @Test
    void getNumberOfInstallments() {
        assertEquals(creditoHipotecario.getNumberOfInstallments(), creditoHipotecario.numberOfInstallments);
        assertEquals(creditoPersonal.getNumberOfInstallments(), creditoPersonal.numberOfInstallments);
    }

    @Test
    void getRequestedAmountIfAccepted() {
        creditoHipotecario.isApplicable();
        assertEquals(0, creditoHipotecario.getRequestedAmountIfAccepted());
        creditoPersonal.isApplicable();
        assertEquals(creditoPersonal.requestedAmount, creditoPersonal.getRequestedAmountIfAccepted());
    }

    @Test
    void getMonthlyInstallmentAmount() {
        creditoHipotecario.isApplicable();
        assertEquals(8333.33, creditoHipotecario.getMonthlyInstallmentAmount());
        creditoPersonal.isApplicable();
        assertEquals(creditoPersonal.requestedAmount / creditoPersonal.numberOfInstallments, creditoPersonal.getMonthlyInstallmentAmount());
    }

    @Test
    void isApplicable() {
        creditoHipotecario.isApplicable();
        assertFalse(creditoHipotecario.isAccepted());
        creditoPersonal.isApplicable();
        assertTrue(creditoPersonal.isAccepted());
    }
}