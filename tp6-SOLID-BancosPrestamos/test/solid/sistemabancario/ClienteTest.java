package solid.sistemabancario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solid.sistemabancario.creditos.CreditoPersonal;
import solid.sistemabancario.creditos.SolicitudDeCredito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Juan", "Pérez", "Calle Falsa 123", LocalDate.of(1990, 1, 1), 50000);
    }

    @Test
    void getNetSalary() {
        double expectedNetSalary = 50000;
        double actualNetSalary = cliente.getNetSalary();
        assertEquals(expectedNetSalary, actualNetSalary);
    }

    @Test
    void calculateAge() {
        int expectedAge = 35;
        int actualAge = cliente.calculateAge(LocalDate.now());
        assertEquals(expectedAge, actualAge);
    }

    @Test
    void annualNetSalary() {
        double expectedAnnualNetSalary = 600000;
        double actualAnnualNetSalary = cliente.annualNetSalary();
        assertEquals(expectedAnnualNetSalary, actualAnnualNetSalary);
    }

    @Test
    void applyForCredit() {
        Banco banco = new Banco(2000000);
        banco.addNewClient(cliente);
        SolicitudDeCredito solicitudDeCredito = new CreditoPersonal(cliente, 120000, 12);
        String expectedMessage = "El credito fue aprobado por el banco por un monto de: 120000.0 y el monto a pagar por mes es: 10000.0 durante 12 meses";
        String actualMessage = cliente.applyForCredit(banco, solicitudDeCredito);
        assertEquals(expectedMessage, actualMessage);
    }
}