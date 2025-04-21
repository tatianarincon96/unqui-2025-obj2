package empleados;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PlantaTemporariaTest {
    PlantaTemporaria empleado;

    @BeforeEach
    void setUp() {
        empleado = new PlantaTemporaria("Juan Perez", "Caba", "Casado", LocalDate.of(1985, 5, 20), 100000, LocalDate.of(2024, 12, 31), 5);
    }

    @Test
    void calcularSueldoBruto() {
        double sueldoBruto = empleado.calcularSueldoBruto();
        assertEquals(100200.0, sueldoBruto);
    }

    @Test
    void calcularRetencion() {
        double retencion = empleado.calcularRetencion();
        double sueldoBruto = empleado.calcularSueldoBruto();
        assertEquals(20065.0, retencion);
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
        assertTrue(desglose.contains("Sueldo básico empleado de planta temporaria: 100000.00"));
        assertTrue(desglose.contains("Horas extra: 200"));
        assertTrue(desglose.contains("Retención obra social: 10020.00"));
        assertTrue(desglose.contains("Retención por edad: 0"));
        assertTrue(desglose.contains("Retención por jubilacion: 10020.00"));
        assertTrue(desglose.contains("Retención por horas extra: 25"));
    }
}