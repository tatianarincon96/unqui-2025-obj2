import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private int cuit;
    private List<Empleado> empleados;
    private List<ReciboHaberes> recibos;

    public Empresa(String nombre, int cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.empleados = new ArrayList<Empleado>();
        this.recibos = new ArrayList<ReciboHaberes>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<ReciboHaberes> getRecibos() {
        return recibos;
    }

    public void setRecibos(List<ReciboHaberes> recibos) {
        this.recibos = recibos;
    }

    public void agregarEmpleados(List<Empleado> empleados) {
        this.empleados.addAll(empleados);
    }

    public void liquidarSueldo() {
        for (Empleado empleado : empleados) {
            ReciboHaberes recibo = new ReciboHaberes(
                    empleado.obtenerDesgloseDeConceptos(),
                    empleado.calcularSueldoNeto(),
                    empleado.calcularSueldoBruto(),
                    LocalDate.now(),
                    empleado.getDireccion(),
                    empleado.getNombre()
            );
            recibos.add(recibo);
        }
    }

    public double calcularMontoTotalSueldosBrutos() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.calcularSueldoBruto();
        }
        return total;
    }

    public double calcularMontoTotalSueldosNetos() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.calcularSueldoNeto();
        }
        return total;
    }

    public double calcularMontoTotalRetenciones() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.calcularRetencion();
        }
        return total;
    }
}
