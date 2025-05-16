package reproductorMP3.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoPauseTest {
    private EstadoPause estadoPause;

    @BeforeEach
    void setUp() {
        ReproductorMP3 reproductor = new ReproductorMP3();
        estadoPause = new EstadoPause(new Cancion(reproductor));
    }

    @Test
    void play() {
        // Simular la acción de reproducir
        estadoPause.play();
        // Verificar que el estado cambie a "Reproduciendo"
        assertSame(estadoPause.cancion.getReproductor().getEstado(), EstadoReproductor.REPRODUCIENDO);
    }

    @Test
    void pause() {
        // Simular la acción de pausar
        estadoPause.pause();
        // Verificar que el estado cambie a "Pausado"
        assertSame(estadoPause.cancion.getReproductor().getEstado(), EstadoReproductor.REPRODUCIENDO);
    }

    @Test
    void stop() {
        // Simular la acción de detener
        estadoPause.stop();
        // Verificar que el estado cambie a "Selección de Canción"
        assertSame(estadoPause.cancion.getReproductor().getEstado(), EstadoReproductor.SELECCION_DE_CANCION);
    }
}