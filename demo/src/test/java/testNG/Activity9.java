package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {

    WebDriver webDriver;

    @BeforeClass
    public void setUpDriver() {
        webDriver = new FirefoxDriver();

        Reporter.log("Starting Test Execution |", true);

        webDriver.get("https://training-support.net/webelements/alerts");
        Reporter.log("Browser opened with Alerts page |", true);

        Reporter.log("Page title: " + webDriver.getTitle() + " |", true);
    }

    @BeforeMethod
    public void resetToDefaultContent() {
        Reporter.log("BeforeMethod: Switching back to default content |", true);
        webDriver.switchTo().defaultContent();
    }

    @Test(priority = 1)
    public void simpleAlertTestCase() {
        Reporter.log("Simple Alert Test started |", true);

        webDriver.findElement(By.id("simple")).click();
        Reporter.log("Simple alert triggered |", true);

        Alert simpleAlertBox = webDriver.switchTo().alert();
        Reporter.log("Switched focus to simple alert |", true);

        String simpleAlertText = simpleAlertBox.getText();
        Reporter.log("Simple alert text: " + simpleAlertText + " |", true);

        Assert.assertEquals(simpleAlertText,
                "You've just triggered a simple alert!");

        simpleAlertBox.accept();
        Reporter.log("Simple alert accepted |", true);
    }

    @Test(priority = 2)
    public void confirmAlertTestCase() {
        Reporter.log("Confirm Alert Test started |", true);

        webDriver.findElement(By.id("confirmation")).click();
        Reporter.log("Confirm alert triggered |", true);

        Alert confirmAlertBox = webDriver.switchTo().alert();
        Reporter.log("Switched focus to confirm alert |", true);

        String confirmAlertText = confirmAlertBox.getText();
        Reporter.log("Confirm alert text: " + confirmAlertText + " |", true);

        Assert.assertEquals(confirmAlertText,
                "You've just triggered a confirmation alert!");

        confirmAlertBox.accept();
        Reporter.log("Confirm alert accepted |", true);
    }

    @Test(priority = 3)
    public void promptAlertTestCase() {
        Reporter.log("Prompt Alert Test started |", true);

        webDriver.findElement(By.id("prompt")).click();
        Reporter.log("Prompt alert triggered |", true);

        Alert promptAlertBox = webDriver.switchTo().alert();
        Reporter.log("Switched focus to prompt alert |", true);

        String promptAlertText = promptAlertBox.getText();
        Reporter.log("Prompt alert text: " + promptAlertText + " |", true);

        Assert.assertEquals(promptAlertText,
                "I'm a Prompt! Type something into me!");

        promptAlertBox.sendKeys("Awesome!");
        Reporter.log("Text entered into prompt alert |", true);

        promptAlertBox.accept();
        Reporter.log("Prompt alert accepted |", true);
    }

    @AfterClass
    public void closeBrowser() {
        Reporter.log("Ending Test Execution |", true);
        webDriver.close();
    }
}
