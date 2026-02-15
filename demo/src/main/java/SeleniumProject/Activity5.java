package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity5 {
    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        driver.findElement(By.linkText("My Account")).click();
        System.out.println(driver.getTitle());
        driver.quit();
    }
   


    
}
