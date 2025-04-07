import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
    private String nombre;
    private String direccion;
    private EstadoCivil estadoCivil;
    private LocalDate fechaNacimiento;
    private double sueldoBasico;

    public Empleado(double sueldoBasico, LocalDate fechaNacimiento, EstadoCivil estadoCivil, String direccion, String nombre) {
        this.sueldoBasico = sueldoBasico;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
