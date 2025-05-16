package videojuego.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoConDosFichasTest {
    private EstadoConDosFichas estadoConDosFichas;

    @BeforeEach
    void setUp() {
        MaquinaVideoJuegos maquina = new MaquinaVideoJuegos();
        estadoConDosFichas = new EstadoConDosFichas(maquina);
    }

    @Test
    void iniciar() {
        // Simular la inserción de una ficha
        estadoConDosFichas.iniciar();
        // Verificar que el mensaje correcto se imprime
        // (En un entorno real, usar un framework de mocking para verificar la salida)
        System.out.println("Test de EstadoConDosFichas: " + estadoConDosFichas.getClass().getSimpleName() + " ejecutado.");
    }
}