package videojuego.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoConUnaFichaTest {
    private EstadoConUnaFicha estadoConUnaFicha;

    @BeforeEach
    void setUp() {
        MaquinaVideoJuegos maquina = new MaquinaVideoJuegos();
        estadoConUnaFicha = new EstadoConUnaFicha(maquina);
    }

    @Test
    void iniciar() {
        // Simular la inserción de una ficha
        estadoConUnaFicha.iniciar();
        // Verificar que el mensaje correcto se imprime
        // (En un entorno real, usar un framework de mocking para verificar la salida)
        System.out.println("Test de EstadoConUnaFicha: " + estadoConUnaFicha.getClass().getSimpleName() + " ejecutado.");
    }
}