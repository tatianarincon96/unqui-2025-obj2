import empleados.Empleado;
import empleados.PlantaPermanente;
import empleados.PlantaTemporaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmpresaTest {
    private Empresa empresa;
    private PlantaPermanente empleado1;
    private PlantaTemporaria empleado2;

    @BeforeEach
    void setUp() {
        empresa = new Empresa("Tech Corp 1", 12345678);
        empleado1 = new PlantaPermanente("Juan Perez", "Calle Falsa 123", "Casado", LocalDate.of(1985, 5, 20), 50000, 2, 10);
        empleado2 = new PlantaTemporaria("Maria Lopez", "Avenida Siempre Viva 456", "Soltero", LocalDate.of(1990, 3, 15), 60000, LocalDate.of(2024, 12, 31), 5);
    }

    @Test
    void getEmpleados() {
        assertTrue(empresa.getEmpleados().isEmpty());

        // Agregamos empleados a la empresa
        empresa.setEmpleados(new ArrayList<>(List.of(empleado1, empleado2)));

        // Verificamos que se contengan los empleados agregados
        assertEquals(2, empresa.getEmpleados().size());
        assertTrue(empresa.getEmpleados().contains(empleado1));
        assertTrue(empresa.getEmpleados().contains(empleado2));
    }

    @Test
    void setEmpleados() {
        // Verificamos que la lista de empleados esté vacía al inicio
        assertTrue(empresa.getEmpleados().isEmpty());

        // Agregamos empleados a la empresa
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empresa.setEmpleados(empleados);

        // Verificamos que se contengan los empleados agregados
        assertEquals(2, empresa.getEmpleados().size());
        assertTrue(empresa.getEmpleados().contains(empleado1));
        assertTrue(empresa.getEmpleados().contains(empleado2));
    }

    @Test
    void getRecibos() {
        // Verificamos que la lista de recibos esté vacía al inicio
        assertTrue(empresa.getRecibos().isEmpty());

        // Liquidamos sueldos para generar recibos
        empresa.setEmpleados(new ArrayList<>(List.of(empleado1, empleado2)));
        empresa.liquidarSueldo();

        // Verificamos que se generen los recibos
        assertEquals(2, empresa.getRecibos().size());
        assertTrue(empresa.getRecibos().get(0).mostrarRecibo().contains("Juan Perez"));
        assertTrue(empresa.getRecibos().get(1).mostrarRecibo().contains("Maria Lopez"));
    }

    @Test
    void liquidarSueldo() {
        // Verificamos que la lista de recibos esté vacía al inicio
        assertTrue(empresa.getRecibos().isEmpty());

        // Liquidamos sueldos
        empresa.setEmpleados(new ArrayList<>(List.of(empleado1, empleado2)));
        empresa.liquidarSueldo();

        // Verificamos que se generen los recibos
        assertEquals(2, empresa.getRecibos().size());
        assertTrue(empresa.getRecibos().get(0).mostrarRecibo().contains("Juan Perez"));
        assertTrue(empresa.getRecibos().get(1).mostrarRecibo().contains("Maria Lopez"));
    }

    @Test
    void calcularMontoTotalSueldosBrutos() {
        // Agregamos empleados a la empresa
        empresa.setEmpleados(new ArrayList<>(List.of(empleado1, empleado2)));

        // Calculamos el monto total de sueldos brutos
        double totalSueldosBrutos = empresa.calcularMontoTotalSueldosBrutos();

        // Verificamos que el monto total sea correcto
        double expectedTotal = empleado1.calcularSueldoBruto() + empleado2.calcularSueldoBruto();
        assertEquals(expectedTotal, totalSueldosBrutos);
    }

    @Test
    void calcularMontoTotalSueldosNetos() {
        // Agregamos empleados a la empresa
        empresa.setEmpleados(new ArrayList<>(List.of(empleado1, empleado2)));

        // Calculamos el monto total de sueldos netos
        double totalSueldosNetos = empresa.calcularMontoTotalSueldosNetos();

        // Verificamos que el monto total sea correcto
        double expectedTotal = empleado1.calcularSueldoNeto() + empleado2.calcularSueldoNeto();
        assertEquals(expectedTotal, totalSueldosNetos);
    }

    @Test
    void calcularMontoTotalRetenciones() {
        // Agregamos empleados a la empresa
        empresa.setEmpleados(new ArrayList<>(List.of(empleado1, empleado2)));

        // Calculamos el monto total de retenciones
        double totalRetenciones = empresa.calcularMontoTotalRetenciones();

        // Verificamos que el monto total sea correcto
        double expectedTotal = empleado1.calcularRetencion() + empleado2.calcularRetencion();
        assertEquals(expectedTotal, totalRetenciones);
    }
}