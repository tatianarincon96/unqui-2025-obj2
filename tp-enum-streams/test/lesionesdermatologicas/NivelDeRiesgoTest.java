package lesionesdermatologicas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NivelDeRiesgoTest {
    NivelDeRiesgo nivelDeRiesgo;

    @BeforeEach
    void setUp() {
        nivelDeRiesgo = NivelDeRiesgo.ALTO;
    }

    @Test
    void getDescripcion() {
        String expected = "Riesgo Alto";
        String actual = nivelDeRiesgo.getDescripcion();
        assertEquals(expected, actual);
    }

    @Test
    void values() {
        NivelDeRiesgo[] expected = {NivelDeRiesgo.ALTO, NivelDeRiesgo.MEDIO, NivelDeRiesgo.BAJO};
        NivelDeRiesgo[] actual = NivelDeRiesgo.values();
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void valueOf() {
        NivelDeRiesgo expected = NivelDeRiesgo.ALTO;
        NivelDeRiesgo actual = NivelDeRiesgo.valueOf("ALTO");
        assertEquals(expected, actual);
    }
}