package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
    private ArrayList<Integer> list = new ArrayList<>();

    public Counter() {}

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    public void addNumber(int number) {
        this.list.add(number);
    }

    // -----------------------------------------------------------------------------

    // 1. Contador de pares, impares y múltiplos

    public int getEvenOcurrences() {
        return (int) list.stream().filter(n -> n%2 == 0).count();
    }

    public int getOddOcurrences() {
        return (int) list.stream().filter(n -> n%2 != 0).count();
    }

    public int getMultiplesOf(int numero) {
        return (int) list.stream().filter(n -> n % numero == 0).count();
    }

    // -----------------------------------------------------------------------------

    // 2. Desarmando números

    public int getNumberWithMoreEvenDigits(ArrayList<Integer> list) {
        int numberWithMoreEvenDigits = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            int evenDigits =  this.countEvenDigits(numberWithMoreEvenDigits);
            int evenDigitsNext = this.countEvenDigits(list.get(i));
            numberWithMoreEvenDigits =  evenDigits > evenDigitsNext ? numberWithMoreEvenDigits : list.get(i);
        }
        return numberWithMoreEvenDigits;
    }

    private int countEvenDigits(int number) {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (number > 0) {
            numbers.add(number % 10);
            number = number / 10;
        }
        return (int) numbers.stream().filter(num -> num % 2 == 0).count();
    }

    // -----------------------------------------------------------------------------

    // 3. Múltiplos

    public int getMaxMultipleInCommon(int x, int y) {
        ArrayList<Integer> multiplesInCommon = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {
            if (i % x == 0 && i % y == 0) {
                multiplesInCommon.add(i);
            }
        }
        return multiplesInCommon.isEmpty() ? -1 : multiplesInCommon.getLast();
    }

    // -----------------------------------------------------------------------------
}
