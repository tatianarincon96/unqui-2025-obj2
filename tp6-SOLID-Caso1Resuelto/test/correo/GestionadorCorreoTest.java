package correo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestionadorCorreoTest {
    private GestionadorCorreo gestionadorCorreo;
    private Correo correo1;

    @BeforeEach
    void setUp() {
        gestionadorCorreo = new GestionadorCorreo();
        correo1 = new Correo("asunto1", "destinatario1", "cuerpo1");
    }

    @Test
    void borrarCorreo() {
        gestionadorCorreo.borrarCorreo(correo1);
        assertEquals(0, gestionadorCorreo.contarInbox());
        assertEquals(1, gestionadorCorreo.contarBorrados());
    }

    @Test
    void contarBorrados() {
        gestionadorCorreo.borrarCorreo(correo1);
        assertEquals(1, gestionadorCorreo.contarBorrados());
    }

    @Test
    void contarInbox() {
        assertEquals(0, gestionadorCorreo.contarInbox());
    }

    @Test
    void eliminarBorrado() {
        gestionadorCorreo.borrarCorreo(correo1);
        gestionadorCorreo.eliminarBorrado(correo1);
        assertEquals(0, gestionadorCorreo.contarBorrados());
    }
}