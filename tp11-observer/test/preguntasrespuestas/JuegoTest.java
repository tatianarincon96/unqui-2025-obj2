package preguntasrespuestas;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class JuegoTest {
    @Test
    public void testNotificacionRespuestaIncorrecta() {
        Pregunta p1 = new Pregunta("Capital de Francia?", "Paris");
        Juego juego = new Juego(List.of(p1));
        //Jugador jugador = mock(Jugador.class);
        Jugador jugador = spy(new Jugador("Ana"));

        // Simular métodos necesarios
        when(jugador.getNombre()).thenReturn("Ana");
        doNothing().when(jugador).notificar(anyString());
        doCallRealMethod().when(jugador).setJuego(any(Juego.class));
        doCallRealMethod().when(jugador).recibirPreguntas(anySet());

        juego.agregarParticipante(jugador);
        // Forzar inicio
        juego.iniciar();

        // Respuesta incorrecta
        juego.recibirRespuesta(jugador, p1, "Londres");

        verify(jugador).notificar("Respuesta incorrecta.");
    }
}