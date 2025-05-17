package Ejercicio5UML;

public class SpecialProduct extends Product {

    @Override
    public float getPrice() {
        return super.getPrice() * 0.9f; // 10% discount
    }
}
