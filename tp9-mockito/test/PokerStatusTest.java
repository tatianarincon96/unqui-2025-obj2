import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokerStatusTest {
    PokerGame pokerStatus;

    @BeforeEach
    void setUp() {
        pokerStatus = new PokerGame();
    }

    @AfterEach
    void tearDown() {
        pokerStatus = null;
    }

    @Test
    void verificarTieneTrio() {
        Carta carta1 = new Carta("2", "P");
        Carta carta2 = new Carta("2", "C");
        Carta carta3 = new Carta("2", "D");
        Carta carta4 = new Carta("3", "T");
        Carta carta5 = new Carta("4", "D");
        String result = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("Trio", result);
    }

    @Test
    void verificarNoTieneNada() {
        Carta carta1 = new Carta("2", "P");
        Carta carta2 = new Carta("3", "C");
        Carta carta3 = new Carta("4", "D");
        Carta carta4 = new Carta("5", "T");
        Carta carta5 = new Carta("6", "D");
        String result = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("Nada", result);
    }

    @Test
    void verificarTienePoker() {
        Carta carta1 = new Carta("2", "P");
        Carta carta2 = new Carta("2", "C");
        Carta carta3 = new Carta("2", "D");
        Carta carta4 = new Carta("2", "T");
        Carta carta5 = new Carta("3", "D");
        String result = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("Poquer", result);
    }

    @Test
    void verificarTieneColor() {
        Carta carta1 = new Carta("2", "P");
        Carta carta2 = new Carta("3", "P");
        Carta carta3 = new Carta("4", "P");
        Carta carta4 = new Carta("5", "P");
        Carta carta5 = new Carta("6", "P");
        String result = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("Color", result);
    }

}