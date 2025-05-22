package templatemethod.wikipedia;

import org.junit.Test;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FiltroTest {

    @Test
    public void testLinkEnComun() {
        WikipediaPage bernal = new Wikipedia("Bernal", List.of(), Map.of());
        WikipediaPage quilmes = new Wikipedia("Quilmes", List.of(bernal), Map.of());
        WikipediaPage buenosAires = new Wikipedia("Buenos Aires", List.of(bernal), Map.of());

        Filtro filtro = new LinkEnComun();
        List<WikipediaPage> result = filtro.getSimilarPages(bernal, List.of(quilmes, buenosAires));

        assertTrue(result.contains(quilmes));
        assertTrue(result.contains(buenosAires));
    }

    @Test
    public void testPropiedadEnComun() {
        WikipediaPage bernal = new Wikipedia("Bernal", List.of(), Map.of("key1", new Wikipedia("Quilmes", List.of(), Map.of())));
        WikipediaPage quilmes = new Wikipedia("Quilmes", List.of(), Map.of("key1", new Wikipedia("Bernal", List.of(), Map.of())));
        WikipediaPage buenosAires = new Wikipedia("Buenos Aires", List.of(), Map.of("key2", new Wikipedia("BsAs", List.of(), Map.of())));

        Filtro filtro = new PropiedadEnComun();
        List<WikipediaPage> result = filtro.getSimilarPages(bernal, List.of(quilmes, buenosAires));

        assertTrue(result.contains(quilmes));
        assertFalse(result.contains(buenosAires));
    }

    @Test
    public void testMismaLetraInicial() {
        WikipediaPage bernal = new Wikipedia("Bernal", List.of(), Map.of());
        WikipediaPage quilmes = new Wikipedia("Quilmes", List.of(), Map.of());
        WikipediaPage buenosAires = new Wikipedia("Buenos Aires", List.of(), Map.of());

        Filtro filtro = new MismaLetraInicial();
        List<WikipediaPage> result = filtro.getSimilarPages(bernal, List.of(quilmes, buenosAires));

        assertFalse(result.contains(quilmes));
        assertTrue(result.contains(buenosAires));
    }
}