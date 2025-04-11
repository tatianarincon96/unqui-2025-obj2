package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultioperadorTest {
    Multioperador multioperador = new Multioperador();

    @BeforeEach
    void setUp() {
        multioperador.addNumber(1);
        multioperador.addNumber(2);
        multioperador.addNumber(3);
        multioperador.addNumber(4);
        multioperador.addNumber(5);
    }

    @Test
    void getSum() {
        Integer result = multioperador.getSum();
        assertEquals(15, result);
    }

    @Test
    void getMultiplication() {
        Integer result = multioperador.getMultiplication();
        assertEquals(120, result);
    }

    @Test
    void getSubtraction() {
        Integer result = multioperador.getSubtraction();
        assertEquals(-15, result);
    }
}