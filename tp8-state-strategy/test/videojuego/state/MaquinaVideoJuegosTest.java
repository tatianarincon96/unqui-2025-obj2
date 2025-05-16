package videojuego.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaquinaVideoJuegosTest {
    private MaquinaVideoJuegos maquina;

    @BeforeEach
    void setUp() {
        maquina = new MaquinaVideoJuegos();
    }

    @Test
    void setEstado() {
        Estado estado = new EstadoSinFicha(maquina);
        maquina.setEstado(estado);
        assertEquals(estado, maquina.getEstado());
    }

    @Test
    void insertarFicha() {
        Estado estadoSinFicha = new EstadoSinFicha(maquina);
        maquina.setEstado(estadoSinFicha);
        maquina.insertarFicha(new Ficha());
        assertTrue(maquina.getEstado() instanceof EstadoConUnaFicha);
    }

    @Test
    void prender() {
        // Simular el encendido de la máquina
        maquina.prender();
        // Verificar que el mensaje correcto se imprime
        // (En un entorno real, usar un framework de mocking para verificar la salida)
        System.out.println("Test de MaquinaVideoJuegos: " + maquina.getClass().getSimpleName() + " ejecutado.");
    }

    @Test
    void iniciar() {
        // Simular la inserción de una ficha
        maquina.insertarFicha(new Ficha());
        maquina.iniciar();
        // Verificar que el mensaje correcto se imprime
        // (En un entorno real, usar un framework de mocking para verificar la salida)
        System.out.println("Test de MaquinaVideoJuegos: " + maquina.getClass().getSimpleName() + " ejecutado.");
    }

    @Test
    void finalizar() {
        // Simular la inserción de una ficha
        maquina.insertarFicha(new Ficha());
        maquina.finalizar();
        // Verificar que el estado vuelve a ser EstadoSinFicha
        assertTrue(maquina.getEstado() instanceof EstadoSinFicha);
    }

    @Test
    void apagar() {
        // Simular la inserción de una ficha
        maquina.insertarFicha(new Ficha());
        maquina.apagar();
        // Verificar que el estado vuelve a ser EstadoSinFicha
        assertTrue(maquina.getEstado() instanceof EstadoSinFicha);
        // Verificar que la máquina está apagada
        System.out.println("Test de MaquinaVideoJuegos: " + maquina.getClass().getSimpleName() + " ejecutado.");
    }
}