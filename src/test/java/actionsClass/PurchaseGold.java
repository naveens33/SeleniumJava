package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PurchaseGold {
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

        // Click the "PURCHASE" link
        driver.findElement(By.linkText("PURCHASE")).click();

        // Click on the "Gold" option
        driver.findElement(By.xpath("//h5[contains(text(),'Gold')]/following-sibling::span")).click();

        // Find the source and target elements for drag-and-drop
        WebElement source = driver.findElement(By.id("drag1"));
        WebElement target = driver.findElement(By.id("droppable"));

        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Perform the drag-and-drop action
        actions.dragAndDrop(source, target).perform();
    }
}
