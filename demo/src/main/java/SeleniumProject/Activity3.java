package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String [] args){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        String first_box_title = driver.findElement(By.xpath("//*[@id='uagb-infobox-f08ebab0-fbf1-40ec-9b2a-c9feeb3d4810']/div/div/div/div[2]")).getText();
        System.out.println("First_box_heading: "+ first_box_title);
        driver.quit();


    }
    
}
