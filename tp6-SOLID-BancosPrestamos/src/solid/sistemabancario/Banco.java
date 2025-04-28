package solid.sistemabancario;

import solid.sistemabancario.creditos.SolicitudDeCredito;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private double money;
    private List<Cliente> clients;
    private List<SolicitudDeCredito> creditRequests;

    public Banco(double money) {
        this.money = money;
        this.clients = new ArrayList<>();
        this.creditRequests = new ArrayList<>();
    }

    public List<Cliente> getClients() {
        return clients;
    }

    public double getMoney() {
        return money;
    }

    public List<SolicitudDeCredito> getCreditRequests() {
        return creditRequests;
    }

    public void addNewClient(Cliente client) {
        clients.add(client);
    }

    public void addCreditRequest(SolicitudDeCredito creditRequest) {
        creditRequests.add(creditRequest);
    }

    public double reviewCreditRequest(SolicitudDeCredito creditRequest) {
        if (clients.contains(creditRequest.getClient())) {
            addCreditRequest(creditRequest);
            evaluateCreditRequest(creditRequest);
            return payCreditRequest(creditRequest);
        } else {
            throw new IllegalArgumentException("El cliente no existe en el banco");
        }
    }

    private double payCreditRequest(SolicitudDeCredito creditRequest) {
        double amount = creditRequest.getRequestedAmountIfAccepted();
        this.money -= amount;
        return amount;
    }

    public void evaluateCreditRequest(SolicitudDeCredito creditRequest) {
       creditRequest.isApplicable();
    }

    public double getTotalAmountPayInCredits() {
        double total = 0;
        for (SolicitudDeCredito creditRequest : creditRequests) {
            total += creditRequest.getRequestedAmountIfAccepted();
        }
        return total;
    }
}
