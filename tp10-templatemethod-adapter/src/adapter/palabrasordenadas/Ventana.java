package adapter.palabrasordenadas;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(ListaDePalabrasAdapter adapter){
        this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        this.setBounds(new Rectangle(180,180));
        this.setVisible(true);
        JLabel label=new JLabel("Lista de palabras");
        label.setBounds(new Rectangle(40,40));
        this.add(label);

        // Uso de adapter
        adapter.agregarPalabra("casa");
        adapter.agregarPalabra("arbol");
        adapter.agregarPalabra("perro");
        adapter.agregarPalabra("telefono");
        adapter.agregarPalabra("brazo");

        JList lista=new JList(adapter);
        lista.setBounds(new Rectangle(110,160));
        this.add(lista);
    }

    public static void main(String[] args) {
        ListaDePalabrasOrdenadas lista = new ListaDePalabrasOrdenadas();
        ListaDePalabrasAdapter adapter = new ListaDePalabrasAdapter(lista);
        new Ventana(adapter);
    }
}
