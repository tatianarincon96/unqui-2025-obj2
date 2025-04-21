import empleados.Empleado;
import empleados.PlantaTemporaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReciboHaberesTest {
    ReciboHaberes recibo;

    @BeforeEach
    void setUp() {
        Empleado empleado = new PlantaTemporaria("Juan Perez", "Caba", "Casado", LocalDate.of(1985, 5, 20), 100000, LocalDate.of(2024, 12, 31), 5);
        recibo = new ReciboHaberes(empleado.getNombre(), empleado.getDireccion(), LocalDate.now(), empleado.calcularSueldoBruto(), empleado.calcularSueldoNeto(), empleado.obtenerDesgloseDeConceptos());
    }

    @Test
    void mostrarRecibo() {
        String reciboEsperado = "Recibo de Haberes\n" +
                "Nombre: Juan Perez\n" +
                "Dirección: Caba\n" +
                "Fecha: " + LocalDate.now() + "\n" +
                "Sueldo Bruto: 100200.0\n" +
                "Sueldo Neto: 100200.0\n" +
                "Desglose de conceptos:\n" +
                "Sueldo básico empleado de planta temporaria: 100000.00\n" +
                "Horas extra: 200\n" +
                "Retención obra social: 10020.00\n" +
                "Retención por edad: 0\n" +
                "Retención por jubilacion: 10020.00\n" +
                "Retención por horas extra: 25";

        assertEquals(reciboEsperado, recibo.mostrarRecibo());
    }
}