package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FirstTest {

    @Test
    public void testGoogle() throws Exception {
    	WebDriver driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
    	driver.findElement(By.name("q")).sendKeys("github.com/imransadhiq",Keys.ENTER);
    	String expected_title = "Google";
    	String Actualtitle = driver.getTitle();
    	System.out.println(Actualtitle);
    	Thread.sleep(5000);
    	Assert.assertEquals(Actualtitle,expected_title, "Title is mismatched");
    	driver.quit();
	}
    @Test
    public void testInsta() throws Exception {
    	WebDriver driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.instagram.com/");
    	driver.findElement(By.name("email")).sendKeys("imransadhiq",Keys.ENTER);
    	driver.findElement(By.name("pass")).sendKeys("Myinstagram786**##",Keys.ENTER);
    	driver.findElement(By.xpath("//span[text()='Log in']")).click();
    	System.out.println(driver.getTitle());
    	Thread.sleep(5000);
    	driver.quit();
	}



}
