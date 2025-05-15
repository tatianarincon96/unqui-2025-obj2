package encriptacion.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelEncripterTest {
    private EncriptadorNaive encriptador;

    @BeforeEach
    void setUp() {
        encriptador = new EncriptadorNaive(new VowelEncripter());
    }

    @Test
    void encriptar() {
        String texto = "Hola Mundo";
        String textoEncriptado = encriptador.encriptar(texto);
        assertEquals("Hule Mandu", textoEncriptado);
    }

    @Test
    void desencriptar() {
        String textoEncriptado = "Hule Mandu";
        String textoDesencriptado = encriptador.desencriptar(textoEncriptado);
        assertEquals("Hola Mundo", textoDesencriptado);
    }
}