package templatemethod.wikipedia;

import java.util.List;

public class MismaLetraInicial implements Filtro {
    @Override
    public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
        //retorna como páginas similares aquellas que poseen la misma
        //primera letra en el comienzo del título, por ejemplo “La Plata” es similar con “Lucas Art”
        //y “Lobo”.
        String firstLetter = page.getTitle().substring(0, 1).toUpperCase();
        return wikipedia.stream()
                .filter(wikiPage -> wikiPage.getTitle().startsWith(firstLetter))
                .toList();
    }
}
