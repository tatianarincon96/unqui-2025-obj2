package encriptacion.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class NumberEncripterTest {
    private EncriptadorNaive encriptador;

    @BeforeEach
    void setUp() {
        encriptador = new EncriptadorNaive(new NumberEncripter());
    }

    @Test
    void encriptar() {
        String texto = "Hola Mundo";
        String resultado = encriptador.encriptar(texto);
        assertEquals("8,16,12,1,0,13,22,14,4,16", resultado);
    }

    @Test
    void desencriptar() {
        String texto = "8,16,12,1,0,13,22,14,4,16";
        String resultado = encriptador.desencriptar(texto);
        assertEquals("hola mundo", resultado);
    }
}