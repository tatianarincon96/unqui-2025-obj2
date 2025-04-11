package ar.edu.unq.po2.tp3;

// 8. Point
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void movePoint(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point newPoint(Point point) {
        return new Point(point.getX() + this.x, point.getY() + this.y);
    }
}
