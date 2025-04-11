package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    Point point;
    Point point2;

    @BeforeEach
    void setUp() {
        point = new Point(1, 2);
        point2 = new Point(3, 4);
    }

    @Test
    void definedPoint() {
        Point definedPoint = new Point(5,6);
        assertEquals(5, definedPoint.getX());
        assertEquals(6, definedPoint.getY());
    }

    @Test
    void defaultPoint() {
        Point defaultPoint = new Point();
        assertEquals(0, defaultPoint.getX());
        assertEquals(0, defaultPoint.getY());
    }

    @Test
    void movepoint() {
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
        point.movePoint(3, 4);
        assertEquals(3, point.getX());
        assertEquals(4, point.getY());
    }

    @Test
    void newPoint() {
        Point newPoint = point.newPoint(point2);
        assertEquals(4, newPoint.getX());
        assertEquals(6, newPoint.getY());
    }
}