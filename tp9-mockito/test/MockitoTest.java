import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockitoTest {
    PokerGame pokerStatus;

    @BeforeEach
    void setUp() {
        pokerStatus = new PokerGame();

    }

    @Test
    void verificarTieneTrio() {
        Carta carta1 = mock(Carta.class);
        Carta carta2 = mock(Carta.class);
        Carta carta3 = mock(Carta.class);
        Carta carta4 = mock(Carta.class);
        Carta carta5 = mock(Carta.class);

        when(carta1.getValor()).thenReturn("2");
        when(carta2.getValor()).thenReturn("2");
        when(carta3.getValor()).thenReturn("2");
        when(carta4.getValor()).thenReturn("3");
        when(carta5.getValor()).thenReturn("4");
        when(carta1.getPalo()).thenReturn("P");
        when(carta2.getPalo()).thenReturn("D");
        when(carta3.getPalo()).thenReturn("T");
        when(carta4.getPalo()).thenReturn("C");
        when(carta5.getPalo()).thenReturn("P");

        String result = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("Trio", result);
    }

    @Test
    void verificarNoTieneNada() {
        Carta carta1 = mock(Carta.class);
        Carta carta2 = mock(Carta.class);
        Carta carta3 = mock(Carta.class);
        Carta carta4 = mock(Carta.class);
        Carta carta5 = mock(Carta.class);

        when(carta1.getValor()).thenReturn("2");
        when(carta2.getValor()).thenReturn("3");
        when(carta3.getValor()).thenReturn("4");
        when(carta4.getValor()).thenReturn("5");
        when(carta5.getValor()).thenReturn("6");
        when(carta1.getPalo()).thenReturn("P");
        when(carta2.getPalo()).thenReturn("D");
        when(carta3.getPalo()).thenReturn("T");
        when(carta4.getPalo()).thenReturn("C");
        when(carta5.getPalo()).thenReturn("P");

        String result = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("Nada", result);
    }

    @Test
    void verificarTienePoker() {
        Carta carta1 = mock(Carta.class);
        Carta carta2 = mock(Carta.class);
        Carta carta3 = mock(Carta.class);
        Carta carta4 = mock(Carta.class);
        Carta carta5 = mock(Carta.class);

        when(carta1.getValor()).thenReturn("2");
        when(carta2.getValor()).thenReturn("2");
        when(carta3.getValor()).thenReturn("2");
        when(carta4.getValor()).thenReturn("2");
        when(carta5.getValor()).thenReturn("3");

        String result = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("Poquer", result);
    }

    @Test
    void verificarTieneColor() {
        Carta carta1 = mock(Carta.class);
        Carta carta2 = mock(Carta.class);
        Carta carta3 = mock(Carta.class);
        Carta carta4 = mock(Carta.class);
        Carta carta5 = mock(Carta.class);

        when(carta1.getPalo()).thenReturn("P");
        when(carta2.getPalo()).thenReturn("P");
        when(carta3.getPalo()).thenReturn("P");
        when(carta4.getPalo()).thenReturn("P");
        when(carta5.getPalo()).thenReturn("P");

        // Para evitar NullPointerException en getValor(), puedes devolver cualquier valor
        when(carta1.getValor()).thenReturn("2");
        when(carta2.getValor()).thenReturn("3");
        when(carta3.getValor()).thenReturn("4");
        when(carta4.getValor()).thenReturn("5");
        when(carta5.getValor()).thenReturn("6");

        String result = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("Color", result);
    }
}