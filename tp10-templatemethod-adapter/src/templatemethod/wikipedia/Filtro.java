package templatemethod.wikipedia;

import java.util.List;

public interface Filtro {
    List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia);
}
