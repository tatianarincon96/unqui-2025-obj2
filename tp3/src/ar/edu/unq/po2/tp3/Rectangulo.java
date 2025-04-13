package ar.edu.unq.po2.tp3;

// 9. Rectángulo
public class Rectangulo {
    private Point point;
    private float length;
    private float height;

    public Rectangulo(Point point, float length, float height) {
        this.point = point;
        this.length = length;
        this.height = height;
    }

    public float area() {
       return this.length * this.height;
    }

    public float perimetro() {
        return (this.length + this.height) * 2;
    }

    public String esHorizontalOVertical() {
        if (this.length > this.height) {
            return "Horizontal";
        } else if ((this.length < this.height)) {
            return "Vertical";
        } else {
            return "Es cuadrado";
        }
    }
}
