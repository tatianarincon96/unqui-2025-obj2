package empleados.estadocivil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoCivilFactoryTest {
    @Test
    void obtenerEstadoCivil() {

        EstadoCivil casado = EstadoCivilFactory.obtenerEstadoCivil("CASADO");
        EstadoCivil soltero = EstadoCivilFactory.obtenerEstadoCivil("SOLTERO");

        assertInstanceOf(Casado.class, casado);
        assertInstanceOf(Soltero.class, soltero);
    }
}