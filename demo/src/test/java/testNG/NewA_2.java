package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import org.testng.SkipException;

public class NewA_2{
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@Test
	public void gettingTitle() {
		System.out.println("Title is"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Selenium: Target Practice");
	}
	
	
    @Test
    public void testCase2() {
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
    }
	
	@Test(enabled = false)
	public void skipping() {
		Assert.assertEquals(driver.getTitle(), "Selenium: Target Practice");
	}
	
	@Test
	public void skip_exception(){ 
			throw new SkipException("Skipping - This is not ready for testing ");
	}
	
	@AfterTest
	
    public void afterMethod() {

        driver.quit();
    }	
}
