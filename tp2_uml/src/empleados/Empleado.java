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

    public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento, double sueldoBasico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = EstadoCivilFactory.obtenerEstadoCivil(estadoCivil);
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBasico = sueldoBasico;
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

    public int calcularEdad() {
        return Period.between(getFechaNacimiento(), LocalDate.now()).getYears();
    }

    public abstract double calcularSueldoBruto();
    public abstract double calcularRetencion();
    public abstract double calcularSueldoNeto();
    public abstract String obtenerDesgloseDeConceptos();
}
