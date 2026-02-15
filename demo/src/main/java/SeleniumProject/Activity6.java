package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity6{
    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        driver.findElement(By.linkText("My Account")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("user_login")).sendKeys("admin");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.name("rememberme")).click();
        driver.findElement(By.id("wp-submit")).click();
        System.out.println("loggedin:"+driver.getTitle());




        driver.quit();
    }
   


    
}
