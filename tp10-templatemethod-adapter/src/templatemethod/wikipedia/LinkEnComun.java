package templatemethod.wikipedia;

import java.util.List;

public class LinkEnComun implements Filtro {

    @Override
    public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
        return wikipedia.stream()
                .filter(wikiPage -> !wikiPage.getLinks().isEmpty() && wikiPage.getLinks().contains(page))
                .toList();
    }
}
