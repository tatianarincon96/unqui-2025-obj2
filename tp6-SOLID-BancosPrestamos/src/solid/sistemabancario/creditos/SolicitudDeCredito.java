package solid.sistemabancario.creditos;

import solid.sistemabancario.Cliente;

public abstract class SolicitudDeCredito {
    protected Cliente client;
    protected double requestedAmount;
    protected int numberOfInstallments;
    protected boolean isAccepted;

    public Cliente getClient() {
        return client;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public int getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public double getRequestedAmountIfAccepted() {
        return isAccepted ? requestedAmount : 0;
    }

    public double getMonthlyInstallmentAmount() {
        return Math.round((requestedAmount / numberOfInstallments) * 100.0) / 100.0;
    }

    public abstract void isApplicable();

}
