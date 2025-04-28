import correo.Correo;
import correo.GestionadorCorreo;
import correo.ICorreo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import servidor.IServidor;
import servidor.ServidorPop;

import static org.junit.jupiter.api.Assertions.*;

class ClienteEMailTest {
    private ClienteEMail clienteEMail;
    private IServidor servidor;
    private ICorreo gestorCorreo;
    private Correo correo1;

    @BeforeEach
    void setUp() {
        servidor = new ServidorPop("user1234", "pass1234");
        gestorCorreo = new GestionadorCorreo();
        clienteEMail = new ClienteEMail(servidor, gestorCorreo);
        correo1 = new Correo("asunto1", "destinatario1", "cuerpo1");
    }

    @Test
    void conectar() {
        clienteEMail.conectar();
    }

    @Test
    void borrarCorreo() {
        clienteEMail.borrarCorreo(correo1);
        assertEquals(0, gestorCorreo.contarInbox());
        assertEquals(1, gestorCorreo.contarBorrados());
    }

    @Test
    void contarBorrados() {
        clienteEMail.borrarCorreo(correo1);
        assertEquals(1, gestorCorreo.contarBorrados());
    }

    @Test
    void contarInbox() {
        assertEquals(0, gestorCorreo.contarInbox());
    }

    @Test
    void eliminarBorrado() {
        clienteEMail.borrarCorreo(correo1);
        clienteEMail.eliminarBorrado(correo1);
        assertEquals(0, gestorCorreo.contarBorrados());
    }

    @Test
    void recibirNuevos() {
        clienteEMail.recibirNuevos();
        assertEquals(0, gestorCorreo.contarInbox());
    }

    @Test
    void enviarCorreo() {
        clienteEMail.enviarCorreo("asunto1", "destinatario1", "cuerpo1");
        assertEquals(0, gestorCorreo.contarInbox());
    }
}