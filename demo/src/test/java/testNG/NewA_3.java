package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class NewA_3{
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form/");
	}
	
	@AfterClass
	public void end() {
		driver.quit();
	}
	
	
	@Test
	public void login_test() {
		driver.findElement(By.id("username")).sendKeys("admin");
	    Reporter.log("Typing in Username",true);
		driver.findElement(By.id("password")).sendKeys("password");
		Reporter.log("Typing in Password",true);
		driver.findElement(By.xpath("//button[text() = 'Submit']")).click();
		Reporter.log("Logging in",true);
		
		String message = driver.findElement(By.xpath("//h2[text()='Welcome Back, Admin!']")).getText();
		Assert.assertEquals("Welcome Back, Admin!", message);
		
	}
	
}