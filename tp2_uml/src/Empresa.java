import empleados.Empleado;

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

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<ReciboHaberes> getRecibos() {
        return recibos;
    }

    public void liquidarSueldo() {
        for (Empleado empleado : empleados) {
            ReciboHaberes recibo = new ReciboHaberes(
                    empleado.getNombre(),
                    empleado.getDireccion(),
                    LocalDate.now(),
                    empleado.calcularSueldoBruto(),
                    empleado.calcularSueldoNeto(),
                    empleado.obtenerDesgloseDeConceptos()
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
