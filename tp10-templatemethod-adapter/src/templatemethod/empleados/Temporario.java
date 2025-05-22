package templatemethod.empleados;

public class Temporario extends Empleado {
    private boolean tieneHijos;
    private boolean estaCasado;

    public Temporario(double sueldoBasico, int horasTrabajadas, double sueldoPorHora, boolean tieneHijos, boolean estaCasado) {
        super(sueldoBasico, horasTrabajadas, sueldoPorHora);
        this.tieneHijos = tieneHijos;
        this.estaCasado = estaCasado;
    }

    @Override
    protected double sueldoPorFamilia() {
        return this.tieneHijos || this.estaCasado ? 100 : 0;
    }
}
