package videojuego.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstadoSinFichaTest {
    private EstadoSinFicha estadoSinFicha;

    @BeforeEach
    void setUp() {
        MaquinaVideoJuegos maquina = new MaquinaVideoJuegos();
        estadoSinFicha = new EstadoSinFicha(maquina);
    }

    @Test
    void iniciar() {
        // Simular la inserción de una ficha
        estadoSinFicha.iniciar();
        // Verificar que el mensaje correcto se imprime
        // (En un entorno real, usar un framework de mocking para verificar la salida)
        System.out.println("Test de EstadoSinFicha: " + estadoSinFicha.getClass().getSimpleName() + " ejecutado.");
    }
}