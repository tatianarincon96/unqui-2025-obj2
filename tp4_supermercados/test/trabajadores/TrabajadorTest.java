package trabajadores;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import supermercado.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

class TrabajadorTest {

    private Trabajador tatiana;

    @BeforeEach
    public void setUp() {
        tatiana = new Trabajador();
        Ingreso ingreso1 = new Ingreso("Octubre", "Salario", 10000);
        IngresoHorasExtras ingreso2 = new IngresoHorasExtras("Abril", "Bono", 2000, 2);
        tatiana.agregarIngreso(ingreso1);
        tatiana.agregarIngreso(ingreso2);
    }

    @Test
    void getTotalPercibido() {
        assertEquals(12000, tatiana.getTotalPercibido());
    }

    @Test
    void getMontoImponible() {
        assertEquals(10000, tatiana.getMontoImponible());
    }

    @Test
    void getImpuestoAPagar() {
        assertEquals(200, tatiana.getImpuestoAPagar());
    }
}