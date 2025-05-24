package publicaciones;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;

public class RepositorioArticulosTest {
    // El patrón Observer es un patrón de diseño de comportamiento que permite que un objeto
    //  (llamado Subject o sujeto) notifique automáticamente a otros objetos (llamados Observers u observadores)
    //  sobre cambios en su estado. Los observadores se suscriben al sujeto y, cuando ocurre un cambio relevante,
    //  el sujeto les envía una notificación. Así, se desacopla el sujeto de los observadores, permitiendo que ambos
    //  evolucionen independientemente.
    @Test
    public void testAgregarArticuloYNotificacion() {
        RepositorioArticulos repo = new RepositorioArticulos();

        Investigador investigador = new Investigador("Ana");
        investigador.agregarCriterio(new CriterioPorLugar("Smalltalks"));
        repo.suscribir(investigador);

        Articulo articulo = new Articulo(
            "Título 1",
            Arrays.asList("Autor1"),
            Arrays.asList("Lab1"),
            "Conferencia",
            "Smalltalks",
            Arrays.asList("oop", "smalltalk")
        );

        repo.agregarArticulo(articulo);

        assertEquals(1, investigador.getArticulosNotificados().size());
        assertEquals("Título 1", investigador.getArticulosNotificados().get(0).getTitulo());
    }
}