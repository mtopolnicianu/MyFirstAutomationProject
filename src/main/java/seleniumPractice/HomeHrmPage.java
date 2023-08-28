package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeHrmPage {
    public static void main(String[]args){
        WebDriverManager.chromedriver().driverVersion("116.0.5845.110").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement enterUserName = driver.findElement(By.cssSelector("input[name='username']"));
        enterUserName.sendKeys("Admin");

        WebElement enterPassword = driver.findElement(By.cssSelector("input.oxd-input[name=password]"));
        enterPassword.sendKeys("admin123");

       WebElement pressLoginButton =  driver.findElement(By.cssSelector("button.oxd-button[type=submit]"));
       pressLoginButton.click();
    }

}
