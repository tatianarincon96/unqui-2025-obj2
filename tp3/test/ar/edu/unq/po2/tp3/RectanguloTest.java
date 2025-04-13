package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {
    Rectangulo rectangulo;

    @BeforeEach
    void setUp() {
        rectangulo = new Rectangulo(new Point(0, 0), 5, 2);
    }

    @Test
    void area() {
        double area = rectangulo.area();
        assertEquals(10, area);
    }

    @Test
    void perimetro() {
        double perimetro = rectangulo.perimetro();
        assertEquals(14, perimetro);
    }

    @Test
    void esHorizontalOVertical() {
        String orientation = rectangulo.esHorizontalOVertical();
        assertEquals("Horizontal", orientation);
    }
}