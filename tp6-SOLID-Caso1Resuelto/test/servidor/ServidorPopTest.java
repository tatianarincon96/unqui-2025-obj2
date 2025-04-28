package servidor;

import correo.Correo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServidorPopTest {
    private ServidorPop servidorPop;
    private Correo correo1;

    @BeforeEach
    void setUp() {
        servidorPop = new ServidorPop("user1234", "pass1234");
        correo1 = new Correo("asunto1", "destinatario1", "cuerpo1");
    }

    @Test
    void recibirNuevos() {
        servidorPop.recibirNuevos();
    }

    @Test
    void conectar() {
        servidorPop.conectar();
    }

    @Test
    void enviar() {
        servidorPop.enviar(correo1);
    }
}