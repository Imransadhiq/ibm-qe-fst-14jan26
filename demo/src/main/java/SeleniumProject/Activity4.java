package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    
    public static void main(String[]args){
        WebDriver driver = new FirefoxDriver();
        String second_course_name = driver.findElement(By.xpath("")).getText();
        
    }
}
