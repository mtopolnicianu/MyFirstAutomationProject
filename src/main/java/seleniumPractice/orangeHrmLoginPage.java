package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class orangeHrmLoginPage {
    public static String browser = "chrome"; //External configuration -XLS, CSV
    public static WebDriver driver;


    public static void main(String[] args) throws InterruptedException {

        if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

//        WebDriverManager.chromedriver().driverVersion("116.0.5845.110").setup();
//        ChromeDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(1000);
        WebElement enterUserName = driver.findElement(By.cssSelector("input[name='username']"));
        enterUserName.sendKeys("Admin");

        Thread.sleep(1000);
        WebElement enterPassword = driver.findElement(By.cssSelector("input.oxd-input[name=password]"));
        enterPassword.sendKeys("admin123");

        Thread.sleep(1000);
        WebElement pressLoginButton = driver.findElement(By.cssSelector("button.oxd-button[type=submit]"));
        pressLoginButton.click();

        Thread.sleep(2000);
        WebElement txt = driver.findElement(By.cssSelector("span:contains('Recruitment')"));
        txt.click();
        driver.close();
        driver.quit();
    }

}
