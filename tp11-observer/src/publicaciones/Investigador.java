package publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Investigador {
    private String nombre;
    private List<CriterioSuscripcion> criterios;
    private List<Articulo> articulosNotificados = new ArrayList<>();

    public Investigador(String nombre) {
        this.nombre = nombre;
        this.criterios = new ArrayList<>();
    }

    public void agregarCriterio(CriterioSuscripcion criterio) {
        criterios.add(criterio);
    }

    public void notificar(Articulo articulo) {
        for (CriterioSuscripcion criterio : criterios) {
            if (criterio.cumple(articulo)) {
                articulosNotificados.add(articulo);
                // Aquí podría ir un mensaje, email, etc.
                break;
            }
        }
    }

    public List<Articulo> getArticulosNotificados() {
        return articulosNotificados;
    }
}