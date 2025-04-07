package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123456);
        list.add(7890);
        list.add(24682);
        int result = counter.xxx(list);
        System.out.println("The number with the most even digits is: " + result);
    }
}