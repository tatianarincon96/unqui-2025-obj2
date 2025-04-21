package empleados;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PlantaPermanenteTest {
    PlantaPermanente empleado;

    @BeforeEach
    void setUp() {
        empleado = new PlantaPermanente("Juan Perez", "Caba", "Casado", LocalDate.of(1985, 5, 20), 100000, 2, 10);
    }

    @Test
    void calcularSueldoBruto() {
        double sueldoBruto = empleado.calcularSueldoBruto();
        assertEquals(100900.0, sueldoBruto);
    }

    @Test
    void calcularRetencion() {
        double retencion = empleado.calcularRetencion();
        double sueldoBruto = empleado.calcularSueldoBruto();
        assertEquals((sueldoBruto * 0.1) + (2 * 20) + (sueldoBruto * 0.15), retencion);
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
        assertTrue(desglose.contains("Sueldo básico empleado de planta permanente: 100000.00"));
        assertTrue(desglose.contains("Asignación por hijos: 300"));
        assertTrue(desglose.contains("Asignación por conyugue: 100.00"));
        assertTrue(desglose.contains("Extra por antiguedad: 500"));
        assertTrue(desglose.contains("Retención obra social: 10090.00"));
        assertTrue(desglose.contains("Retención por hijos: 40"));
        assertTrue(desglose.contains("Retención por jubilacion: 15135.00"));
    }
}