package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TSHomepageSteps extends BaseClass {

    @Given("user is on the TS homepage")
    public void openTSHomepage() {
        driver.get("https://training-support.net");
        assertEquals("Training Support", driver.getTitle());
    }

    @When("the user clicks on the About Us link")
    public void clickButton() {
        driver.findElement(By.linkText("About Us")).click();
    }

    @Then("they are redirected to another page")
    public void aboutUsPage() {
        wait.until(ExpectedConditions.titleIs("About Training Support"));
        String pageHeading =
            driver.findElement(By.cssSelector("h1.text-center")).getText();

        System.out.println("New page title is: " + pageHeading);
        assertEquals("About Us", pageHeading);
    }
}
