package empleados;

import java.time.LocalDate;

public class Contratado extends Empleado {

    private int nrodeContrato;
    private String medioDePago;

    public Contratado(double sueldoBasico, LocalDate fechaNacimiento, String estadoCivil, String direccion, String nombre, int nrodeContrato, String medioDePago) {
        super(sueldoBasico, fechaNacimiento, estadoCivil, direccion, nombre);
        this.nrodeContrato = nrodeContrato;
        this.medioDePago = medioDePago;
    }

    @Override
    public double calcularSueldoBruto() {
        return getSueldoBasico();
    }

    @Override
    public double calcularRetencion() {
        return 50;
    }

    @Override
    public double calcularSueldoNeto() {
        return this.calcularSueldoBruto() - this.calcularRetencion();
    }

    @Override
    public String obtenerDesgloseDeConceptos() {
        String mensaje = String.format("Sueldo básico empleado contratado: %.2f ", getSueldoBasico());
        mensaje += String.format("\nRetención por gastos administrativos contractuales: %.2f ", this.calcularRetencion());

        return mensaje;
    }
}
