package adapter.teoria;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Adaptee
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        // Adaptador
        Iterator<String> it = lista.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Ejemplo 2
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("uno");
        lista2.add("dos");
        Iterator<String> it2 = lista2.iterator();
        Enumeration<String> enumeration = new IteratorToEnumerationAdapter<>(it2);

        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }



    }
}
