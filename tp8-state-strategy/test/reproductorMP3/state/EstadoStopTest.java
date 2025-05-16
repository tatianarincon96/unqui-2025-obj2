package reproductorMP3.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoStopTest {
    private EstadoStop estadoStop;

    @BeforeEach
    void setUp() {
        ReproductorMP3 reproductor = new ReproductorMP3();
        estadoStop = new EstadoStop(new Cancion(reproductor));
    }

    @Test
    void play() {
        // Simular la acción de reproducir
        estadoStop.play();
        // Verificar que el estado cambie a "Reproduciendo"
        assertSame(EstadoReproductor.REPRODUCIENDO, estadoStop.cancion.getReproductor().getEstado());
    }

    @Test
    void pause() {
        // Simular la acción de pausar
        estadoStop.pause();
        // Verificar que el estado cambie a "Pausado"
        assertSame(EstadoReproductor.SELECCION_DE_CANCION, estadoStop.cancion.getReproductor().getEstado());
    }

    @Test
    void stop() {
        // Simular la acción de detener
        estadoStop.stop();
        // Verificar que el estado siga siendo "Detenido"
        assertSame(EstadoReproductor.SELECCION_DE_CANCION, estadoStop.cancion.getReproductor().getEstado());
    }
}