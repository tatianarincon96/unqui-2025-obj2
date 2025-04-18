import ar.edu.unq.po2.tp3.Cuadrado;
import ar.edu.unq.po2.tp3.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {
    private Cuadrado cuadrado;

    @BeforeEach
    void setUp() {
        cuadrado = new Cuadrado(new Point(0, 0), 5);
    }

    @Test
    void area() {
        float expectedArea = 25.0f;
        assertEquals(expectedArea, cuadrado.area());
    }

    @Test
    void perimetro() {
        float expectedPerimetro = 20.0f;
        assertEquals(expectedPerimetro, cuadrado.perimetro());
    }
}