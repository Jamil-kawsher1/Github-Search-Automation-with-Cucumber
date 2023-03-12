package pages;

import Setup.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GithubHomePage  {

    @FindBy(name = "q")
    WebElement searchTerminputField;
    @FindBy(tagName = "h3")
   public List <WebElement> searchResult;
    @FindBy(className = "f4")
   public List <WebElement> firstResult;
    @FindBy(xpath = "//a[contains(text(),'About')]")
public WebElement about;

    public GithubHomePage(WebDriver driver){
        PageFactory.initElements( driver, this);
    }

public void searchSpecificString(String term) throws InterruptedException {
Thread.sleep(5000);

        searchTerminputField.sendKeys(term);
        searchTerminputField.submit();

}



}
