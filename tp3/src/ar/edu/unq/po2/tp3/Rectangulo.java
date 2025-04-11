package ar.edu.unq.po2.tp3;

// 9. Rectángulo
public class Rectangulo {
    private Point xx;
    private Point xy;
    private Point yy;
    private Point yx;
    private int coordenadaX;
    private int coordenadaY;

    public Rectangulo(Point p1, Point p2, Point p3, Point p4) throws IllegalArgumentException {
        if (this.areValidPoints(p1, p2, p3, p4)) {
            this.xx = p1;
            this.xy = p2;
            this.yy = p3;
            this.yx = p4;
        } else {
            throw new IllegalArgumentException("Invalid points for rectangle");
        }
        this.coordenadaX = p1.getX();
        this.coordenadaY = p1.getY();
    }

    public boolean areValidPoints(Point p1, Point p2, Point p3, Point p4) {
        return p1.getX() == p2.getY() && p3.getX() == p1.getX() && (p4.getX() == p2.getX() && p4.getY() == p3.getY());
    }

    public int area() {
        int base = Math.abs(this.xx.getX() - this.xy.getX());
        int altura = Math.abs(this.xx.getY() - this.yy.getY());
        return base * altura;
    }

    public int perimetro() {
        int base = Math.abs(this.xx.getX() - this.xy.getX());
        int altura = Math.abs(this.xx.getY() - this.yy.getY());
        return (base + altura) * 2;
    }

    public String esHorizontalOVertical() {
        if (this.xy.getX() > this.yy.getY()) {
            return "Horizontal";
        } else {
            return "Vertical";
        }
    }
}
