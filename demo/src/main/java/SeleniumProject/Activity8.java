package SeleniumProject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8 {
        public static void main(String[]args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms"); 
        driver.findElement(By.linkText("Contact")).click();
        driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Rolex");
        driver.findElement(By.id("wpforms-8-field_1")).sendKeys("rolex@gmail.com");
        driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Message");
        driver.findElement(By.id("wpforms-8-field_2")).sendKeys("Message");
        driver.findElement(By.xpath("//button[normalize-space()= 'Send Message']")).click();
        System.out.println("Form Sent: "+driver.getTitle());
        driver.quit();
    }
    
}
