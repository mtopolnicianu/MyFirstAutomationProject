package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
    public static void main(String[]args){
        WebDriverManager.chromedriver().driverVersion("116.0.5845.110").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement enterUserNameBox = driver.findElement(By.cssSelector("input[name=username]")); //tag and attribute
        enterUserNameBox.sendKeys("Admin");

        //how to use className as locator
        int sliders = driver.findElements(By.className("homeslider-container")).size();
        System.out.println(sliders);

        //how to use tagName as locator
        int links = driver.findElements(By.tagName("a")).size();
        System.out.println(links);


        WebElement enterPasswordBox = driver.findElement(By.cssSelector("input.oxd-input")); //Tag and Class
        enterPasswordBox.sendKeys("admin123");

        WebElement pressLoginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        pressLoginButton.click();
    }
}
