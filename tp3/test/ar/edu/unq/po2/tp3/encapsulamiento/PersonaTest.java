package ar.edu.unq.po2.tp3.encapsulamiento;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    Persona p1;
    Persona p2;

    @BeforeEach
    void setUp() {
        p1 = new Persona("Juan", LocalDate.of(2000, 1, 1));
        p2 = new Persona("Pedro", LocalDate.of(1995, 1, 1));
    }

    @Test
    void getName() {
        assertEquals("Juan", p1.getName());
        assertEquals("Pedro", p2.getName());
    }

    @Test
    void getBirthDate() {
        assertEquals(LocalDate.of(2000, 1, 1), p1.getBirthDate());
        assertEquals(LocalDate.of(1995, 1, 1), p2.getBirthDate());
    }

    @Test
    void getAge() {
        assertEquals(25, p1.getAge());
        assertEquals(30, p2.getAge());
    }

    @Test
    void menorQue() {
        assertTrue(p1.menorQue(p2));
        assertFalse(p2.menorQue(p1));
    }
}