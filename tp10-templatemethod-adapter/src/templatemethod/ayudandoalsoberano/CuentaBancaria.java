package templatemethod.ayudandoalsoberano;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
    private String titular;
    private int saldo;
    private List<String> movimientos;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new ArrayList<String>();
    }

    // Operación Concreta
    public String getTitular() {
        return this.titular;
    }

    // Operación Concreta
    public int getSaldo() {
        return this.saldo;
    }

    // Operación Concreta
    protected void setSaldo(int monto) {
        this.saldo = monto;
    }

    // Operación Concreta
    public void agregarMovimientos(String movimiento) {
        this.movimientos.add(movimiento);
    }

    // Template Method
    public void extraer(int monto) {
        if (this.condition(monto)) {
            this.setSaldo(this.getSaldo() - monto);
            this.agregarMovimientos("Extraccion");
        }
    }

    // Operación Primitiva
    public abstract boolean condition( int monto);

    // No hay hooks
}
