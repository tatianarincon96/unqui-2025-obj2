package empleados;

import java.time.LocalDate;

public class PlantaTemporaria extends Empleado {

    private LocalDate fechaFinDesignacionPT;
    private int cantidadHorasExtras;

    public PlantaTemporaria(double sueldoBasico, LocalDate fechaNacimiento, String estadoCivil, String direccion, String nombre, LocalDate fechaFinDesignacionPT, int cantidadHorasExtras) {
        super(sueldoBasico, fechaNacimiento, estadoCivil, direccion, nombre);
        this.fechaFinDesignacionPT = fechaFinDesignacionPT;
        this.cantidadHorasExtras = cantidadHorasExtras;
    }

    @Override
    public double calcularSueldoBruto() {
        double horasExtras = this.cantidadHorasExtras * 40;

        return getSueldoBasico() + horasExtras;
    }

    @Override
    public double calcularRetencion() {
        double sueldoBruto = this.calcularSueldoBruto();
        double obraSocial = sueldoBruto * 0.1;
        double antiguedad = this.calcularEdad() > 50 ? 25 : 0;
        double jubilacion = sueldoBruto * 0.1;
        double horasExtras = this.cantidadHorasExtras * 5;

        return obraSocial + antiguedad + jubilacion + horasExtras;
    }

    @Override
    public double calcularSueldoNeto() {
        return this.calcularSueldoBruto() - this.calcularRetencion();
    }

    @Override
    public String obtenerDesgloseDeConceptos() {
        String mensaje = String.format("Sueldo básico empleado de planta temporaria: %.2f ", getSueldoBasico());
        mensaje += String.format("\nHoras extra: %d ", this.cantidadHorasExtras * 40);
        mensaje += String.format("\nRetención obra social: %.2f ", this.calcularSueldoBruto() * 0.1);
        mensaje += String.format("\nRetención por edad: %d ", this.calcularEdad() > 50 ? 25 : 0);
        mensaje += String.format("\nRetención por jubilacion: %.2f ", this.calcularSueldoBruto() * 0.1);
        mensaje += String.format("\nRetención por horas extra: %d ", this.cantidadHorasExtras * 5);

        return mensaje;
    }
}
