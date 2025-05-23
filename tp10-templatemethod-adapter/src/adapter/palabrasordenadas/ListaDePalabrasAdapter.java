package adapter.palabrasordenadas;

import javax.swing.DefaultListModel;

// Se crea un adaptador que conecta la lógica de ListaDePalabrasOrdenadas con el modelo de datos que espera
// el JList, permitiendo así mostrar y mantener la lista ordenada automáticamente en la interfaz gráfica.
public class ListaDePalabrasAdapter extends DefaultListModel<String> {
    private final ListaDePalabrasOrdenadas lista;

    public ListaDePalabrasAdapter(ListaDePalabrasOrdenadas lista) {
        this.lista = lista;
        actualizarModelo();
    }

    public void agregarPalabra(String palabra) {
        lista.agregarPalabra(palabra);
        actualizarModelo();
    }

    private void actualizarModelo() {
        this.clear();
        for (int i = 0; i < lista.cantidadDePalabras(); i++) {
            this.addElement(lista.getPalabraDePosicion(i));
        }
    }
}