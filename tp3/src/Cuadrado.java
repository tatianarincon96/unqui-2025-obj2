import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangulo;

public class Cuadrado {
    private Rectangulo rectangulo;

    public Cuadrado(Point point, float length) {
        this.rectangulo = new Rectangulo(point, length, length);
    }

    public float area() {
        return rectangulo.area();
    }

    public float perimetro() {
        return rectangulo.perimetro();
    }
}
