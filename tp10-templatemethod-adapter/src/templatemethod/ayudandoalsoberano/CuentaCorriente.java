package templatemethod.ayudandoalsoberano;

public class CuentaCorriente extends CuentaBancaria {
    private int descubierto;
    public CuentaCorriente(String titular, int descubierto){
        super(titular);
        this.descubierto=descubierto;
    }
    // Operación Concreta
    public int getDescubierto(){
        return this.descubierto;
    }
    // Operación Primitiva
    @Override
    public boolean condition(int monto) {
        return this.getSaldo() + this.getDescubierto() >= monto;
    }
}
