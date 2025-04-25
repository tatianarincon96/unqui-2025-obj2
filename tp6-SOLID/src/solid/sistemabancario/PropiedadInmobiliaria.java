package solid.sistemabancario;

public class PropiedadInmobiliaria {
    private String description;
    private String address;
    private double taxValue;

    public PropiedadInmobiliaria(String description, String address, double taxValue) {
        this.description = description;
        this.address = address;
        this.taxValue = taxValue;
    }

    public double getTaxValue() {
        return taxValue;
    }
}
