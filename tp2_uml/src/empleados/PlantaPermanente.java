package empleados;

import java.time.LocalDate;

public class PlantaPermanente extends Empleado {

    private int cantidadHijos;
    private int antiguedad;

    public PlantaPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento, double sueldoBasico, int cantidadHijos, int antiguedad) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.cantidadHijos = cantidadHijos;
        this.antiguedad = antiguedad;
    }

    @Override
    public double calcularSueldoBruto() {
        double asignacionPorHijos = this.cantidadHijos * 150;
        double asignacionPorConyugue = getEstadoCivil().getMonto();
        double extraPorAntiguedad = this.antiguedad * 50;

        return getSueldoBasico() + asignacionPorHijos + asignacionPorConyugue + extraPorAntiguedad;
    }

    @Override
    public double calcularRetencion() {
        double sueldoBruto = this.calcularSueldoBruto();
        double obraSocial = sueldoBruto * 0.1;
        double hijos = this.cantidadHijos * 20;
        double jubilacion = sueldoBruto * 0.15;

        return obraSocial + hijos + jubilacion;
    }

    @Override
    public double calcularSueldoNeto() {
        return this.calcularSueldoBruto() - this.calcularRetencion();
    }

    @Override
    public String obtenerDesgloseDeConceptos() {
        String mensaje = String.format("Sueldo básico empleado de planta permanente: %.2f ", getSueldoBasico());
        mensaje += String.format("\nAsignación por hijos: %d ", this.cantidadHijos * 150);
        mensaje += String.format("\nAsignación por conyugue: %.2f ", getEstadoCivil().getMonto());
        mensaje += String.format("\nExtra por antiguedad: %d ", this.antiguedad * 50);
        mensaje += String.format("\nRetención obra social: %.2f ", this.calcularSueldoBruto() * 0.1);
        mensaje += String.format("\nRetención por hijos: %d ", this.cantidadHijos * 20);
        mensaje += String.format("\nRetención por jubilacion: %.2f ", this.calcularSueldoBruto() * 0.15);

        return mensaje;
    }
}
