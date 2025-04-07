package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.stream.Collectors;

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

    public int getEvenOcurrences() {
        return (int) list.stream().filter(n -> n%2 == 0).count();
    }

    public int getOddOcurrences() {
        return (int) list.stream().filter(n -> n%2 != 0).count();
    }

    public int obtainMultiplesOf(int numero) {
        return (int) list.stream().filter(n -> n % numero == 0).count();
    }

    private int countDigits(int number) {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (number > 0) {
            numbers.add(number % 10);
            number = number / 10;
        }
        System.out.println(number);
        return (int) numbers.stream().filter(num -> num % 2 == 0).count();
    }

    public int xxx(ArrayList<Integer> list) {
        //Diseñe e implemente una función Java que reciba un arreglo de números enteros y
        //devuelva el número que tiene la mayor cantidad de dígitos pares. No puede utilizar
        //String!!. Por lo cual, debe razonar cómo desarmar el número utilizando los operadores
        //de los números enteros (div y mod).
        int moreEvenDigits = this.countDigits(list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            int evenDigits = this.countDigits(list.get(i));
            moreEvenDigits = Math.max(evenDigits, moreEvenDigits);
        }
        return moreEvenDigits;
    }

/*    public int getMaxDigitCount() {
        // Realice una función que reciba dos valores X e Y, y devuelva el número más alto entre 0 y 1000, que sea
        //múltiplo simultáneamente de X e Y. Si no existe, devolver -1. Por ejemplo si se ingresa 3 y 9, la función debe
        //devolver 999.
    }*/
}
