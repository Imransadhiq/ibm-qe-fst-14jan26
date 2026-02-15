package testNG;

import org.openqa.selenium.By;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class NewA_1{
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get(" https://training-support.net");
	}
	
	@Test(priority = 1)
	public void homepage(){
		Assert.assertEquals(driver.getTitle(), "Training Support");
		driver.findElement(By.linkText("About Us")).click();
	}

	@Test(priority = 2)
	public void titlepage() {
		Assert.assertEquals(driver.getTitle(), "About Training Support");
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	



}