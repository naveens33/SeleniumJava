package workingWithAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HelpScreenAlertHandle {
    public static void main(String[] args) {
        // Initialize the WebDriver, open a Chrome browser and navigate to the website
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://birdbank.pythonanywhere.com/");
        WebElement loginButton = driver.findElement(By.id("signin_button"));
        loginButton.click();
        driver.findElement(By.id("id_username")).sendKeys("testuser1");
        driver.findElement(By.name("password")).sendKeys("testpassword");
        driver.findElement(By.id("signin")).click();

        // Click the "HELP" link
        driver.findElement(By.linkText("HELP")).click();

        // Click the "Submit" button
        driver.findElement(By.id("submit")).click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Accept the alert (click OK)
        alert.accept();
    }
}
