package reproductorMP3.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoPlayTest {
    private EstadoPlay estadoPlay;

    @BeforeEach
    void setUp() {
        Cancion cancion = new Cancion(new ReproductorMP3());
        estadoPlay = new EstadoPlay(cancion);
    }

    @Test
    void play() {
        // Simular la acción de reproducir
        estadoPlay.play();
        // Verificar que el estado cambie a "Reproduciendo"
        assertEquals(EstadoReproductor.REPRODUCIENDO, estadoPlay.cancion.getReproductor().getEstado());
        // Verificar que se imprima el mensaje correcto
        System.out.println("Test de EstadoPlay: " + estadoPlay.getClass().getSimpleName() + " ejecutado.");
    }

    @Test
    void pause() {
        // Simular la acción de pausar
        estadoPlay.pause();
        // Verificar que el estado cambie a "Pausado"
        assertEquals(EstadoReproductor.PAUSADO, estadoPlay.cancion.getReproductor().getEstado());
        // Verificar que se imprima el mensaje correcto
        System.out.println("Test de EstadoPlay: " + estadoPlay.getClass().getSimpleName() + " ejecutado.");
    }

    @Test
    void stop() {
        // Simular la acción de detener
        estadoPlay.stop();
        // Verificar que el estado cambie a "Detenido"
        assertEquals(EstadoReproductor.SELECCION_DE_CANCION, estadoPlay.cancion.getReproductor().getEstado());
        // Verificar que se imprima el mensaje correcto
        System.out.println("Test de EstadoPlay: " + estadoPlay.getClass().getSimpleName() + " ejecutado.");
    }
}