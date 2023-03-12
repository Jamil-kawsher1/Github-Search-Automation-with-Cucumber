package StepDefinitions;

import Setup.Setup;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GithubHomePage;
import utils.Utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GithubPageStepDefinitions extends Setup {

    GithubHomePage githubHomePage;

    @Given("User is a guest user on the GitHub landing page")
    public void i_am_a_guest_user_on_the_GitHub_landing_page () {
        driver.get("https://github.com");
    }

    @When("User search for {string} from the landing page search input")

    public void i_search_for_from_the_landing_page_search_input (String searchTerm) throws InterruptedException {

        githubHomePage = new GithubHomePage(driver);
        githubHomePage.searchSpecificString(searchTerm);
    }

    @Then("User see a count of matching results")
    public void i_see_a_count_of_matching_results () throws InterruptedException {
        githubHomePage = new GithubHomePage(driver);
        // Code to verify the count of matching results
//        System.out.println(githubHomePage.searchResult.get(2).getText());
        Thread.sleep(5000);
        String actual = githubHomePage.searchResult.get(2).getText();
        System.out.println();
        Assert.assertTrue(actual.contains("repository results"));
//        assertTrue(githubHomePage.searchResult.get(2).getText().matches("\\d+ repository results"));
    }

    @Then("User verify that {string} is the first result")
    public void i_verify_that_is_the_first_result (String firstResult) throws InterruptedException {


        githubHomePage = new GithubHomePage(driver);
        String actualFirstResult = githubHomePage.firstResult.get(1).getText();
        Assert.assertEquals(actualFirstResult, firstResult);
    }

    @When("User click the About button in the landing page footer")
    public void i_click_the_button_in_the_landing_page_footer () throws InterruptedException {
        githubHomePage = new GithubHomePage(driver);
        Utils.doScroll(driver, 1200);
        Thread.sleep(4000);

        githubHomePage.about.click();

    }

    @Then("User click on the About page")
    public void i_am_taken_to_the_GitHub_page () throws InterruptedException {

        Thread.sleep(5000);
        String pageTitle = driver.getTitle();
        String pageTitleExpected="About";
        Assert.assertTrue(pageTitle.contains(pageTitleExpected));
    }


}
