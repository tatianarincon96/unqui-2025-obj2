package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {
    Rectangulo rectangulo;
    Point point1;
    Point point2;
    Point point3;
    Point point4;

    @BeforeEach
    void setUp() {
        point1 = new Point(0, 0);
        point2 = new Point(5, 0);
        point3 = new Point(0, 2);
        point4 = new Point(5, 2);
        rectangulo = new Rectangulo(point1, point2, point3, point4);
    }

    @Test
    void throwExceptionWhenPointsAreNotValid() {
        Point invalidPoint = new Point(1, 1);
        assertThrows(IllegalArgumentException.class, () -> {
            rectangulo = new Rectangulo(point1, point2, point3, invalidPoint);
        });
    }

    @Test
    void isValidPoint() {
        assertTrue(rectangulo.areValidPoints(point1, point2, point3, point4));
    }

    @Test
    void isNotValidPoint() {
        point1.setX(1);
        assertFalse(rectangulo.areValidPoints(point1, point2, point3, point4));
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