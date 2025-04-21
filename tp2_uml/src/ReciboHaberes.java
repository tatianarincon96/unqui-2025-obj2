import java.time.LocalDate;
import java.util.Map;

public class ReciboHaberes {
    private String nombreEmpleado;
    private String direccion;
    private LocalDate fechaEmision;
    private double sueldoBruto;
    private double sueldoNeto;
    private String desgloseConceptos;

    public ReciboHaberes(String nombreEmpleado, String direccion, LocalDate fechaEmision, double sueldoBruto, double sueldoNeto, String desgloseConceptos) {
        this.nombreEmpleado = nombreEmpleado;
        this.direccion = direccion;
        this.fechaEmision = fechaEmision;
        this.sueldoBruto = sueldoBruto;
        this.sueldoNeto = sueldoNeto;
        this.desgloseConceptos = desgloseConceptos;
    }

    public String mostrarRecibo() {
        StringBuilder recibo = new StringBuilder();
        recibo.append("Nombre: ").append(nombreEmpleado).append("\n");
        recibo.append("Dirección: ").append(direccion).append("\n");
        recibo.append("Fecha de Emisión: ").append(fechaEmision).append("\n");
        recibo.append("Sueldo Bruto: ").append(sueldoBruto).append("\n");
        recibo.append("Sueldo Neto: ").append(sueldoNeto).append("\n");
        recibo.append("Desglose de Conceptos:\n").append(desgloseConceptos);
        return recibo.toString();
    }
}
