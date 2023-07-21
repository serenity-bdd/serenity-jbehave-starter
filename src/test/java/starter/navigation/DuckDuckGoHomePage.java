package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DuckDuckGoHomePage extends PageObject {

    @FindBy(name="q")
    WebElement searchBar;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;

    @Step
    public void openApp()
    {
        open();
    }

    @Step
    public void searchAndSelect(String input)
    {
        searchBar.sendKeys(input);
        searchButton.click();
    }


}
