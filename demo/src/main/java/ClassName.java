import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassName {
  public static void main(String[] args) {
    // Create a new instance of the Firefox driver
    WebDriver driver = new FirefoxDriver();
    
    // Open the browser
    driver.get("https://training-support.net");

    // Perform testing and assertions

    // Close the browser
    // Feel free to comment out the line below
    // so it doesn't close too quickly
    String title = driver.getTitle();
    System.out.println("Page Title: " + title);
    driver.findElement(By.linkText("About Us")).click();
    System.out.println("About Us: " + driver.getTitle());
    String newPageTitle = driver.getTitle();
    System.out.println("New Page Title is: " + newPageTitle);
    driver.quit();

  }
}