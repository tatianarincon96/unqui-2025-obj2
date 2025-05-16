package reproductorMP3.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReproductorMP3Test {
    private ReproductorMP3 reproductorMP3;

    @BeforeEach
    void setUp() {
        reproductorMP3 = new ReproductorMP3();
    }

    @Test
    void getEstado() {
        // Verificar que el estado inicial es SELECCION_DE_CANCION
        assertEquals(EstadoReproductor.SELECCION_DE_CANCION, reproductorMP3.getEstado());
    }

    @Test
    void setEstado() {
        // Cambiar el estado a REPRODUCIR
        reproductorMP3.setEstado(EstadoReproductor.REPRODUCIENDO);
        // Verificar que el estado ha cambiado correctamente
        assertEquals(EstadoReproductor.REPRODUCIENDO, reproductorMP3.getEstado());
    }

    @Test
    void getCancion() {
        // Verificar que la canción inicial es null
        assertNull(reproductorMP3.getCancion());
        // Crear una nueva canción y asignarla
        Cancion cancion = new Cancion(reproductorMP3);
        reproductorMP3.setCancion(cancion);
        // Verificar que la canción se ha asignado correctamente
        assertEquals(cancion, reproductorMP3.getCancion());
    }

    @Test
    void setCancion() {
        // Crear una nueva canción
        Cancion cancion = new Cancion(reproductorMP3);
        // Asignar la canción al reproductor
        reproductorMP3.setCancion(cancion);
        // Verificar que la canción se ha asignado correctamente
        assertEquals(cancion, reproductorMP3.getCancion());
    }

    @Test
    void play() {
        // Crear una nueva canción y asignarla al reproductor
        Cancion cancion = new Cancion(reproductorMP3);
        reproductorMP3.setCancion(cancion);
        // Cambiar el estado a SELECCION_DE_CANCION
        reproductorMP3.setEstado(EstadoReproductor.SELECCION_DE_CANCION);
        // Reproducir la canción
        reproductorMP3.play();
        // Verificar que el estado ha cambiado a REPRODUCIENDO
        assertEquals(EstadoReproductor.REPRODUCIENDO, reproductorMP3.getEstado());
    }

    @Test
    void pause() {
        // Crear una nueva canción y asignarla al reproductor
        Cancion cancion = new Cancion(reproductorMP3);
        reproductorMP3.setCancion(cancion);
        // Pausar la canción
        reproductorMP3.pause();
        // Verificar que el estado ha cambiado a SELECCION_DE_CANCION porque la canción ya está detenida
        assertEquals(EstadoReproductor.SELECCION_DE_CANCION, reproductorMP3.getEstado());
    }

    @Test
    void stop() {
        // Crear una nueva canción y asignarla al reproductor
        Cancion cancion = new Cancion(reproductorMP3);
        reproductorMP3.setCancion(cancion);
        // Detener la canción
        reproductorMP3.stop();
        // Verificar que el estado ha cambiado a SELECCION_DE_CANCION
        assertEquals(EstadoReproductor.SELECCION_DE_CANCION, reproductorMP3.getEstado());
    }
}