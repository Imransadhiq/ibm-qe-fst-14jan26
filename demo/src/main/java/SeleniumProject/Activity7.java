package SeleniumProject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
    public static void main(String[]args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");    
        driver.findElement(By.linkText("All Courses")).click();
        List<WebElement> courses = driver.findElements(By.className("ld_course_grid"));
        System.out.println("Available Courses: "+courses.size());
        driver.quit();

    }
}
       
