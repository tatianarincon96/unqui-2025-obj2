package lesionesdermatologicas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColorTest {
    Color color;

    @BeforeEach
    void setUp() {
        color = Color.Rojo;
    }

    @Test
    void getDescripcion() {
        String expected = "Lesión reciente";
        String actual = color.getDescripcion();
        assertEquals(expected, actual);
    }

    @Test
    void getNivelDeRiesgo() {
        NivelDeRiesgo expected = NivelDeRiesgo.ALTO;
        NivelDeRiesgo actual = color.getNivelDeRiesgo();
        assertEquals(expected, actual);
    }

    @Test
    void proximo() {
        Color expected = Color.Gris;
        Color actual = color.proximo();
        assertEquals(expected, actual);
    }

    @Test
    void testToString() {
        String expected = "Rojo (Lesión reciente, Riesgo: Riesgo Alto)";
        String actual = color.toString();
        assertEquals(expected, actual);
    }

    @Test
    void values() {
        Color[] expected = {Color.Rojo, Color.Gris, Color.Amarillo, Color.Miel};
        Color[] actual = Color.values();
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void valueOf() {
        Color expected = Color.Rojo;
        Color actual = Color.valueOf("Rojo");
        assertEquals(expected, actual);
    }
}