package workingWithDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TransferAmountExample {
    public static void main(String[] args) {
        // Initialize the WebDriver, open the browser and navigate to the website
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://birdbank.pythonanywhere.com/");

        // Login to the website
        WebElement loginButton = driver.findElement(By.id("signin_button"));
        loginButton.click();
        driver.findElement(By.id("id_username")).sendKeys("testuser1");
        driver.findElement(By.name("password")).sendKeys("testpassword");
        driver.findElement(By.id("signin")).click();

        // Navigate to the "TRANSFER" page
        driver.findElement(By.linkText("TRANSFER")).click();
        driver.findElement(By.id("ownacc")).click();
        driver.findElement(By.id("9999000473354500")).click();

        // Locate the "fromAccount" dropdown and create a Select object
        WebElement fromAccountEle = driver.findElement(By.id("fromaccount"));
        Select fromAccount = new Select(fromAccountEle);
        //fromAccount.selectByIndex(2);
        //fromAccount.selectByValue("527");

        // Select an option from the "fromAccount" dropdown by visible text
        fromAccount.selectByVisibleText("9999000453354530");

        // Check if the "toAccount" element is enabled
        WebElement toAccountEle = driver.findElement(By.id("toaccount"));
        if (toAccountEle.isEnabled()) {
            System.err.println("Error: the element is enabled");
        }

        // Enter the amount and message
        driver.findElement(By.id("amount")).sendKeys("500");
        driver.findElement(By.id("message")).sendKeys("Payment");

        // Click the "confirm_payment" button
        driver.findElement(By.id("confirm_payment")).click();

        // Get and display the confirmation message
        WebElement confirmationText = driver.findElement(By.id("confirmationMessage"));

        // Check if the confirmation message is correct
        if (!confirmationText.getText().equals("Transaction Successful")) {
            System.err.println("Incorrect confirmation Message");
        }

        // Close the browser
        driver.quit();
    }
}
