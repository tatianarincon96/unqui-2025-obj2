package reproductorMP3.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CancionTest {
    private Cancion cancion;

    @BeforeEach
    void setUp() {
        cancion = new Cancion(new ReproductorMP3());
    }

    @Test
    void getReproductor() {
        ReproductorMP3 reproductor = cancion.getReproductor();
        assertNotNull(reproductor, "El reproductor no debe ser nulo");
    }

    @Test
    void setEstadoActual() {
        EstadoCancion nuevoEstado = new EstadoPlay(cancion);
        cancion.setEstadoActual(nuevoEstado);
        assertEquals(nuevoEstado, cancion.getEstadoActual(), "El estado actual no se ha actualizado correctamente");
    }

    @Test
    void play() {
        cancion.play();
        assertEquals(EstadoReproductor.REPRODUCIENDO, cancion.getReproductor().getEstado(), "El reproductor no está en estado REPRODUCIENDO");
    }

    @Test
    void pause() {
        cancion.play(); // Cambia el estado a REPRODUCIENDO
        cancion.pause();
        assertEquals(EstadoReproductor.PAUSADO, cancion.getReproductor().getEstado(), "El reproductor no está en estado PAUSADO");
    }

    @Test
    void stop() {
        cancion.play(); // Cambia el estado a REPRODUCIENDO
        cancion.stop();
        assertEquals(EstadoReproductor.SELECCION_DE_CANCION, cancion.getReproductor().getEstado(), "El reproductor no está en estado SELECCION_DE_CANCION");
    }
}