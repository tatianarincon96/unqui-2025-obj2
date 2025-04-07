import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Corp 2", 12345679);
        PlantaPermanente empleado3 = new PlantaPermanente(60000, LocalDate.of(1980, 8, 10), EstadoCivil.SOLTERO, "Calle Falsa 456", "Ana Garcia", 1, 15);
        System.out.println("Empleado 3 edad: " + empleado3.calcularEdad());
        PlantaTemporaria empleado4 = new PlantaTemporaria(45000, LocalDate.of(1992, 11, 5), EstadoCivil.CASADO, "Avenida Siempre Viva 123", "Pedro Martinez", LocalDate.of(2023, 12, 31), 10);
        System.out.println("Empleado 4 edad: " + empleado4.calcularEdad());
        System.out.println("--------------------------------------------------");
        empresa.agregarEmpleados(new ArrayList<>(List.of(empleado3, empleado4)));
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