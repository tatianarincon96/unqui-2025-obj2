package cultivos;

public class Parcela implements Cultivable {
    private Cultivable parcela1;
    private Cultivable parcela2;
    private Cultivable parcela3;
    private Cultivable parcela4;

    public Parcela(Cultivable parcela1, Cultivable parcela2, Cultivable parcela3, Cultivable parcela4) {
        this.parcela1 = parcela1;
        this.parcela2 = parcela2;
        this.parcela3 = parcela3;
        this.parcela4 = parcela4;
    }

    @Override
    public double calcularGananciasAnuales() {
        return parcela1.calcularGananciasAnuales() / 4 + parcela2.calcularGananciasAnuales() / 4 +
               parcela3.calcularGananciasAnuales() / 4 + parcela4.calcularGananciasAnuales() / 4;
    }
}
