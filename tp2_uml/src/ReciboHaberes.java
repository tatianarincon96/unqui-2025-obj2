import java.time.LocalDate;
import java.util.Map;

public class ReciboHaberes {
    private String nombreEmpleado;
    private String direccion;
    private LocalDate fechaEmision;
    private double sueldoBruto;
    private double sueldoNeto;
    private String desgloseConceptos;

    public ReciboHaberes(String desgloseConceptos, double sueldoNeto, double sueldoBruto, LocalDate fechaEmision, String direccion, String nombreEmpleado) {
        this.desgloseConceptos = desgloseConceptos;
        this.sueldoNeto = sueldoNeto;
        this.sueldoBruto = sueldoBruto;
        this.fechaEmision = fechaEmision;
        this.direccion = direccion;
        this.nombreEmpleado = nombreEmpleado;
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
