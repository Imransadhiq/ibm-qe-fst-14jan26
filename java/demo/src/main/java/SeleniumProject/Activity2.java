package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity2 {
    public static void main(String[]args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        System.out.println("Page Title: "+ driver.getTitle());
        String website_Heading = driver.findElement(By.className("uagb-ifb-title")).getText();
        System.out.println("Website Heading: "+website_Heading);
        driver.quit();

    }
    
}
