package solid.sistemabancario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solid.sistemabancario.creditos.CreditoHipotecario;

import java.time.LocalDate;

class BancoTest {
    Banco banco;
    Cliente cliente1;
    Cliente cliente2;

    @BeforeEach
    void setUp() {
        cliente1 = new Cliente("Juan", "Pérez", "Calle Falsa 123", LocalDate.of(1990, 1, 1), 100000);
        cliente2 = new Cliente("Ana", "Gómez", "Avenida Siempre Viva 456", LocalDate.of(1985, 5, 15), 150000);
        banco = new Banco(1000000);
    }

    @Test
    void addNewClient() {
        banco.addNewClient(cliente1);
        banco.addNewClient(cliente2);
        Assertions.assertEquals(2, banco.getClients().size());
    }

    @Test
    void addCreditRequest() {
        CreditoHipotecario creditoHipotecario = new CreditoHipotecario(cliente1, 500000, 60, new PropiedadInmobiliaria("Casa", "Calle Falsa 123", 700000));
        banco.addCreditRequest(creditoHipotecario);
        Assertions.assertEquals(1, banco.getCreditRequests().size());
    }

    @Test
    void applyForCredit() {
        CreditoHipotecario creditoHipotecario = new CreditoHipotecario(cliente1, 500000, 60, new PropiedadInmobiliaria("Casa", "Calle Falsa 123", 700000));
        banco.addNewClient(cliente1);
        double amount = banco.reviewCreditRequest(creditoHipotecario);
        Assertions.assertEquals(0, amount);
        Assertions.assertEquals(1000000, banco.getMoney());
    }

    @Test
    void evaluateCreditRequest() {
        CreditoHipotecario creditoHipotecario = new CreditoHipotecario(cliente1, 500000, 60, new PropiedadInmobiliaria("Casa", "Calle Falsa 123", 700000));
        banco.evaluateCreditRequest(creditoHipotecario);
        Assertions.assertFalse(creditoHipotecario.isAccepted());
    }

    @Test
    void getTotalAmountPayInCredits() {
        CreditoHipotecario creditoHipotecario1 = new CreditoHipotecario(cliente1, 500000, 60, new PropiedadInmobiliaria("Casa", "Calle Falsa 123", 700000));
        CreditoHipotecario creditoHipotecario2 = new CreditoHipotecario(cliente2, 300000, 36, new PropiedadInmobiliaria("Departamento", "Avenida Siempre Viva 456", 400000));
        banco.addCreditRequest(creditoHipotecario1);
        banco.addCreditRequest(creditoHipotecario2);
        double totalAmount = banco.getTotalAmountPayInCredits();
        Assertions.assertEquals(0, totalAmount);
    }
}