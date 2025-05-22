public class Carta {
    private String valor;
    private String palo;

    public Carta(String valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public Carta() {
    }

    public String getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    public boolean esSuperior(Carta otraCarta) {
        return this.valor.compareTo(otraCarta.valor) > 0;
    }

    public boolean esDelMismoPalo(Carta otraCarta) {
        return this.palo.equals(otraCarta.palo);
    }
}
