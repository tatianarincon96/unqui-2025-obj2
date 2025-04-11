package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTestCase {
    private Counter counter;
    /**
     * Crea un escenario de test básico, que consiste en un contador
     * con 10 enteros
     *
     * @throws Exception
     */
    @BeforeEach
    public void setUp() throws Exception {
        //Se crea el contador
        counter = new Counter();
        //Se agregan los numeros. Un solo par y nueve impares
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(64);
    }

    /**
     * Verifica la cantidad de pares
     */
    @Test
    public void testEvenNumbers() {
        // Getting the even occurrences
        int amount = counter.getEvenOcurrences();
        // I check the amount is the expected one
        assertEquals(1, amount);
    }


    @Test
    void testOddNumbers() {
        int amount = counter.getOddOcurrences();
        assertEquals(9, amount);
    }

    @Test
    void testMultipleNumbers() {
        int amount = counter.getMultiplesOf(3);
        assertEquals(2, amount);
    }

    @Test
    void testNumberWithMoreEvenDigits() {
        int number = counter.getNumberWithMoreEvenDigits(counter.getList());
        assertEquals(64, number);
    }

    @Test
    void getMultiples() {
        int amount = counter.getMaxMultipleInCommon(3,9);
        assertEquals(999, amount);
    }
}
