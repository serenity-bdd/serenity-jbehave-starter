package starter.stepdefinitions;
import net.thucydides.core.annotations.Managed;
import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebDriver;
import starter.navigation.DuckDuckGoHomePage;


public class SearchOnDuckDuckGoStepDefinitions {

    @Managed(driver = "edge")
    WebDriver driver;

    DuckDuckGoHomePage duckDuckGoHomePage;

    @Given("Sergey is on the DuckDuckGo home page")
    public void login() {
        duckDuckGoHomePage.openApp();
    }

    @When("he searches for <keyword>")
    public void search(@Named("keyword") String keyword) {
        System.out.println("When");
        duckDuckGoHomePage.searchAndSelect(keyword);
    }

    @Then("all the result titles should contain the word <keyword>")
    public void verify(@Named("keyword") String keyword) throws InterruptedException {
        System.out.println("Then");
        Thread.sleep(2000);
    }

    @Given("Sergey is on the DuckDuckGo home pages")
    public void logins() {
        duckDuckGoHomePage.openApp();
    }
}
