package collections;

import mercado.productos.Producto;

import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ColeccionadorDeObjetos {

    public Object getFirstFrom(List<Producto> collection) {
        return collection.get(0);
    }

    public void addLast(Object element, List<Producto> collection) {
        collection.add((Producto) element);
    }

    public Collection getSubCollection(List<Producto> collection, int from, int to) {
        return collection.subList(from,to);
    }

    public Boolean containElement(List<Producto> collection, Object element) {
        return collection.contains(element);
    }
}
