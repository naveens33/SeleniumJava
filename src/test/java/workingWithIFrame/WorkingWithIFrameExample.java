package workingWithIFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WorkingWithIFrameExample {
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

        // Click the "LOANS" link
        driver.findElement(By.linkText("LOANS")).click();

        // Click on the "Car Loan" option
        driver.findElement(By.xpath("//h5[text()='Car Loan']/following-sibling::span")).click();

        // Switch to the first iframe (index 0)
        driver.switchTo().frame(0);

        // Print the text inside the element with the CSS selector "project-name"
        System.out.println(driver.findElement(By.cssSelector("project-name")).getText());

        // Switch back to the main content
        driver.switchTo().defaultContent();
    }
}
