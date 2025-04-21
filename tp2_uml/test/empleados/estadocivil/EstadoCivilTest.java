package empleados.estadocivil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoCivilTest {
    EstadoCivil casado;
    EstadoCivil soltero;

    @BeforeEach
    void setUp() {
        casado = new Casado();
        soltero = new Soltero();
    }

    @Test
    void getMonto() {
        double montoCasado = casado.getMonto();
        double montoSoltero = soltero.getMonto();

        assertEquals(100.0, montoCasado);
        assertEquals(0.0, montoSoltero);
    }
}