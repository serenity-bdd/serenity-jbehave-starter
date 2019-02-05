package starter.stepdefinitions;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;
import static starter.matchers.StringContainsIgnoringCase.containsIgnoringCase;

public class SearchOnDuckDuckGoStepDefinitions {

    @BeforeStory
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("$actor is on the DuckDuckGo home page")
    public void on_the_DuckDuckGo_home_page(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theDuckDuckGoHomePage());
    }

    @When("he searches for \"$term\"")
    public void search_for(String term) {
        theActorInTheSpotlight().attemptsTo( SearchFor.term(term) );
    }

    @Then("all the result titles should contain the word \"$term\"")
    public void all_the_result_titles_should_contain_the_word(String term) {
        theActorInTheSpotlight().should(
                seeThat("search result titles",
                        SearchResult.titles(), hasSize(greaterThan(0))),
                seeThat("search result titles",
                        SearchResult.titles(), everyItem(containsIgnoringCase(term)))
        );
    }
}
