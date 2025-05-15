package encriptacion.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncriptadorNaiveTest {
    EncriptadorNaive encriptadorNaive;
    Encripter encripter;

    @BeforeEach
    void setUp() {
        encripter = new VowelEncripter();
        encriptadorNaive = new EncriptadorNaive(encripter);
    }

    @Test
    void setEncripter() {
        String texto = "hola";
        String textoEncriptado = encriptadorNaive.encriptar(texto);
        assertEquals("hule", textoEncriptado);
        Encripter nuevoEncripter = new NumberEncripter();
        encriptadorNaive.setEncripter(nuevoEncripter);
        String textoEncriptado2 = encriptadorNaive.encriptar(texto);
        assertEquals("8,16,12,1", textoEncriptado2);
    }

    @Test
    void encriptar() {
        String texto = "hola";
        String textoEncriptado = encriptadorNaive.encriptar(texto);
        assertEquals("hule", textoEncriptado);
    }

    @Test
    void desencriptar() {
        String textoEncriptado = "hule";
        String textoDesencriptado = encriptadorNaive.desencriptar(textoEncriptado);
        assertEquals("hola", textoDesencriptado);
    }
}