import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaTest {
    Carta carta1;
    Carta carta2;

    @BeforeEach
    void setUp() {
        carta1 = new Carta("2", "P");
        carta2 = new Carta("3", "C");
    }

    @Test
    void esSuperior() {
        assertTrue(carta2.esSuperior(carta1), "La carta 2 debería ser superior a la carta 1");
        assertFalse(carta1.esSuperior(carta2), "La carta 1 no debería ser superior a la carta 2");
    }

    @Test
    void esDelMismoPalo() {
        Carta carta3 = new Carta("4", "P");
        Carta carta4 = new Carta("5", "C");

        assertTrue(carta1.esDelMismoPalo(carta3), "Las cartas 1 y 3 deberían ser del mismo palo");
        assertFalse(carta1.esDelMismoPalo(carta4), "Las cartas 1 y 4 no deberían ser del mismo palo");
    }
}