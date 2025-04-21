package empleados;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ContratadoTest {
    Contratado empleado;

    @BeforeEach
    void setUp() {
        empleado = new Contratado("Juan Perez", "Caba", "Casado", LocalDate.of(1995, 10, 5),150000, 15, "Banco Ciudad");
    }

    @Test
    void calcularSueldoBruto() {
        double sueldoBruto = empleado.calcularSueldoBruto();
        assertEquals(150000.0, sueldoBruto);
    }

    @Test
    void calcularRetencion() {
        double retencion = empleado.calcularRetencion();
        double sueldoBruto = empleado.calcularSueldoBruto();
        assertEquals(50, retencion);
    }

    @Test
    void calcularSueldoNeto() {
        double sueldoNeto = empleado.calcularSueldoNeto();
        double sueldoBruto = empleado.calcularSueldoBruto();
        double retencion = empleado.calcularRetencion();
        assertEquals(sueldoBruto - retencion, sueldoNeto);
    }

    @Test
    void obtenerDesgloseDeConceptos() {
        String desglose = empleado.obtenerDesgloseDeConceptos();
        assertTrue(desglose.contains("Sueldo básico empleado contratado: 150000.00"));
        assertTrue(desglose.contains("Retención por gastos administrativos contractuales: 50.00"));
    }
}