package templatemethod.empleados;

public abstract class Empleado {
    private double sueldoBasico;
    private int horasTrabajadas;
    private double sueldoPorHora;

    public Empleado(double sueldoBasico, int horasTrabajadas, double sueldoPorHora) {
        this.sueldoBasico = sueldoBasico;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    protected double sueldo() {
        double sueldoBruto = this.getSueldoBasico() +
                this.sueldoPorHorasTrabajadas() +
                this.sueldoPorFamilia();
        return this.descontarAportesYObraSocial(sueldoBruto);
    }

    protected double getSueldoBasico() {
        return this.sueldoBasico;
    }

    protected double sueldoPorHorasTrabajadas() {
        return this.horasTrabajadas * this.sueldoPorHora;
    }

    protected double sueldoPorFamilia() {
        return 0;
    }

    protected double descontarAportesYObraSocial(double sueldoBruto) {
        return sueldoBruto * 0.87;
    }

}
