package starter.search;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.List;

public class SearchResult {
    public static Question<List<String>> summaries() {
        return actor -> TextContent.of(SearchResultList.RESULT_SUMMARY).viewedBy(actor).asList();
    }
}
