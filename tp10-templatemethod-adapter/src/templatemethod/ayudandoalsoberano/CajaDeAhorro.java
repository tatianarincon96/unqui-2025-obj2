package templatemethod.ayudandoalsoberano;

public class CajaDeAhorro extends CuentaBancaria {
    private int limite;
    public CajaDeAhorro(String titular, int limite){
        super(titular);
        this.limite=limite;
    }
    // Operación Concreta
    public int getLimite(){
        return this.limite;
    }
    // Operación Primitiva
    @Override
    public boolean condition(int monto) {
        return this.getSaldo()>=monto && this.getLimite()>=monto;
    }
}
