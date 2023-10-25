package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddNewPayBills {
    public static void main(String[] args) throws InterruptedException {
        // Initialize the WebDriver, open a Chrome browser and navigate to the website
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://birdbank.pythonanywhere.com/");
        WebElement loginButton = driver.findElement(By.id("signin_button"));
        loginButton.click();
        driver.findElement(By.id("id_username")).sendKeys("testuser1");
        driver.findElement(By.name("password")).sendKeys("testpassword");
        driver.findElement(By.id("signin")).click();

        // Click the "Pay Bills" tab
        driver.findElement(By.xpath("//a[@id='nav-paybills-tab']")).click();

        // Click the "Add Payee" button
        driver.findElement(By.xpath("//button[@id='add_payee']")).click();

        // Add a delay of 5 seconds (not recommended, use explicit wait instead)
        //Thread.sleep(5000);

        // Set an implicit wait with a timeout of 5 seconds
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Use explicit wait to wait for the "Biller Name" input field to become visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Biller Namefdsfd')]")));

        // Enter the biller's name
        element.sendKeys("Jessica");
    }
}
