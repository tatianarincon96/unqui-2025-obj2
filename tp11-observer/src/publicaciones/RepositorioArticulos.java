package publicaciones;

import java.util.ArrayList;
import java.util.List;

// 2. Patrones de diseño utilizados
//Observer:
//Subject: publicaciones.RepositorioArticulos
//Observer: publicaciones.Investigador
//Strategy (para criterios de suscripción):
//Strategy: publicaciones.CriterioSuscripcion
public class RepositorioArticulos {
    private List<Articulo> articulos = new ArrayList<>();
    private List<Investigador> suscriptores = new ArrayList<>();

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
        notificarSuscriptores(articulo);
    }

    public void suscribir(Investigador investigador) {
        suscriptores.add(investigador);
    }

    private void notificarSuscriptores(Articulo articulo) {
        for (Investigador investigador : suscriptores) {
            investigador.notificar(articulo);
        }
    }
}