package templatemethod.wikipedia;

import java.util.List;

public class PropiedadEnComun implements Filtro {

    @Override
    public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
        // retorna aquellas páginas que poseen alguna propiedad del infobox
        //en común, por ejemplo si la página de una persona tiene la propiedad “birth_place” y otra
        //página posee también la propiedad “birth_place” serian similares mutuamente. En este
        //caso, no importa que el valor de la propiedad sea diferente.
        return wikipedia.stream()
                .filter(wikiPage -> page.getInfobox().keySet().stream()
                        .anyMatch(key -> wikiPage.getInfobox().containsKey(key)))
                .toList();
    }
}
