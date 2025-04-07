import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Corp 1", 12345678);
        PlantaPermanente empleado1 = new PlantaPermanente(50000, LocalDate.of(1985, 5, 20), EstadoCivil.CASADO, "Calle Falsa 123", "Juan Perez", 2, 10);
        System.out.println("Empleado 1 edad: " + empleado1.calcularEdad());
        PlantaTemporaria empleado2 = new PlantaTemporaria(40000, LocalDate.of(1990, 3, 15), EstadoCivil.SOLTERO, "Avenida Siempre Viva 742", "Maria Lopez", LocalDate.of(2024, 12, 31), 5);
        System.out.println("Empleado 2 edad: " + empleado2.calcularEdad());
        System.out.println("--------------------------------------------------");
        empresa.agregarEmpleados(new ArrayList<>(List.of(empleado1, empleado2)));
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