package encriptacion.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderChangeEncripterTest {
    private EncriptadorNaive encriptador;

    @BeforeEach
    void setUp() {
        encriptador = new EncriptadorNaive(new OrderChangeEncripter());
    }

    @Test
    void encriptar() {
        String texto = "Hola Mundo";
        String textoEncriptado = encriptador.encriptar(texto);
        assertEquals("Mundo Hola", textoEncriptado);
    }

    @Test
    void desencriptar() {
        String textoEncriptado = "Mundo Hola";
        String textoDesencriptado = encriptador.desencriptar(textoEncriptado);
        assertEquals("Hola Mundo", textoDesencriptado);
    }
}