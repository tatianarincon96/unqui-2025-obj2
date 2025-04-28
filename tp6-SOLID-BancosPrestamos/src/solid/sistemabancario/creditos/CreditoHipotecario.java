package solid.sistemabancario.creditos;

import solid.sistemabancario.Cliente;
import solid.sistemabancario.PropiedadInmobiliaria;

import java.time.LocalDate;

public class CreditoHipotecario extends SolicitudDeCredito {
    private PropiedadInmobiliaria property;

    public CreditoHipotecario(Cliente client, double requestedAmount, int termInMonths, PropiedadInmobiliaria property) {
        this.client = client;
        this.requestedAmount = requestedAmount;
        this.numberOfInstallments = termInMonths;
        this.isAccepted = false;
        this.property = property;
    }

    @Override
    public void isApplicable() {
        LocalDate dateInFuture = LocalDate.now().plusMonths(numberOfInstallments);
        this.isAccepted = getMonthlyInstallmentAmount() <= this.client.getNetSalary() * 0.5 && this.requestedAmount <= this.property.getTaxValue() * 0.7 && this.client.calculateAge(dateInFuture) <= 65;
    }
}
