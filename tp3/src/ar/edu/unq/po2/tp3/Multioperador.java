package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

// 6. Multioperador
public class Multioperador {

    private ArrayList<Integer> numberList;

    public Multioperador() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number) {
        this.numberList.add(number);
    }

    public int getSum() {
        return this.numberList.stream().reduce(0, Integer::sum);
    }

    public int getMultiplication() {
        return this.numberList.stream().reduce(1, (a, b) -> a * b);
    }

    public int getSubtraction() {
        return this.numberList.stream().reduce(0, (a, b) -> a - b);
    }
}
