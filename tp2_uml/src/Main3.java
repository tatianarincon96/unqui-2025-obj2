import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        // Caso 3 con empleados CONTRATADOS - No necesito modificar la empresa, porque como tal, la empresa sigue teniendo empleados, el contratado solo es un nuevo tipo de empleado.
        Empresa empresa = new Empresa("Tech Corp 3", 12345690);
        Contratado empleado5 = new Contratado(60000, LocalDate.of(1980, 8, 10), EstadoCivil.SOLTERO, "Calle Falsa 456", "Ana Garcia", 1, "Transferencia");
        System.out.println("Empleado 5 edad: " + empleado5.calcularEdad());
        Contratado empleado6 = new Contratado(45000, LocalDate.of(1992, 11, 5), EstadoCivil.CASADO, "Avenida Siempre Viva 123", "Pedro Martinez", 10, "Cheque");
        System.out.println("Empleado 6 edad: " + empleado6.calcularEdad());
        System.out.println("--------------------------------------------------");
        empresa.agregarEmpleados(new ArrayList<>(List.of(empleado5, empleado6)));
        empresa.liquidarSueldo();
        List<ReciboHaberes> recibos = empresa.getRecibos();
        System.out.println("Recibos de sueldo: ");
        for (ReciboHaberes recibo : recibos) {
            System.out.println(recibo.mostrarRecibo());
            System.out.println("--------------------------------------------------");
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Total de costo de sueldos netos: " + empresa.calcularMontoTotalSueldosNetos());
    }
}