package Ejercicio5UML;

import java.util.List;

public class CarroDeCompras {
    private List<Product> elements;

    private void setElements(List<Product> elements) {
        this.elements = elements;
    }

    public List<Product> getElements() {
        return elements;
    }

    public int totalRounded() {
        int total = 0;
        for (Product product : elements) {
            total += (int) product.getPrice();
        }
        return total;
    }

    public float total() {
        float total = 0;
        for (Product product : elements) {
            total += product.getPrice();
        }
        return total;
    }
}
