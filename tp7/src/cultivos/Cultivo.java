package cultivos;

public abstract class Cultivo implements Cultivable {
    protected double precio;

    @Override
    public double calcularGananciasAnuales() {
        return precio;
    }
}
