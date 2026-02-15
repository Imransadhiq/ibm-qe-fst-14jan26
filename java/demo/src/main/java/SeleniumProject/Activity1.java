package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity1 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        System.out.println("Page Title: "+driver.getTitle());

        driver.quit();



    }
    
}
