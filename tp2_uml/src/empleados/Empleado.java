package empleados;

import empleados.estadocivil.EstadoCivil;
import empleados.estadocivil.EstadoCivilFactory;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
    private String nombre;
    private String direccion;
    private EstadoCivil estadoCivil;
    private LocalDate fechaNacimiento;
    private double sueldoBasico;

    public Empleado(double sueldoBasico, LocalDate fechaNacimiento, String estadoCivil, String direccion, String nombre) {
        this.sueldoBasico = sueldoBasico;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = EstadoCivilFactory.obtenerEstadoCivil(estadoCivil);
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int calcularEdad() {
        return Period.between(getFechaNacimiento(), LocalDate.now()).getYears();
    }

    public abstract double calcularSueldoBruto();
    public abstract double calcularRetencion();
    public abstract double calcularSueldoNeto();
    public abstract String obtenerDesgloseDeConceptos();
}
