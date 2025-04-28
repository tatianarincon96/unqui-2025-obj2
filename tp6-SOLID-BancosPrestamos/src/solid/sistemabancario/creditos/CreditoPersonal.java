package solid.sistemabancario.creditos;

import solid.sistemabancario.Cliente;

public class CreditoPersonal extends SolicitudDeCredito {

    public CreditoPersonal(Cliente client, double requestedAmount, int termInMonths) {
        this.client = client;
        this.requestedAmount = requestedAmount;
        this.numberOfInstallments = termInMonths;
        this.isAccepted = false;
    }

    @Override
    public void isApplicable() {
        this.isAccepted = this.client.annualNetSalary() >= 15000 && this.getMonthlyInstallmentAmount() <= this.client.getNetSalary() * 0.7;
    }
}
