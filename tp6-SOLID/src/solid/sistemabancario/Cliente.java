package solid.sistemabancario;

import solid.sistemabancario.creditos.SolicitudDeCredito;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private String name;
    private String lastname;
    private String address;
    private LocalDate dateOfBirth;
    private double netSalary;

    public Cliente(String name, String lastname, String address, LocalDate dateOfBirth, double netSalary) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.netSalary = netSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public int calculateAge(LocalDate date) {
        return Period.between(dateOfBirth,date).getYears();
    }

    public double annualNetSalary() {
        return netSalary * 12;
    }

    public String applyForCredit(Banco bank, SolicitudDeCredito creditRequest) {
        double amount = bank.reviewCreditRequest(creditRequest);
        if (amount > 0) {
            return "El credito fue aprobado por el banco por un monto de: " + amount + " y el monto a pagar por mes es: " + creditRequest.getMonthlyInstallmentAmount() + " durante " + creditRequest.getNumberOfInstallments() + " meses";
        } else {
            return "El credito fue rechazado por el banco";
        }
    }
}
