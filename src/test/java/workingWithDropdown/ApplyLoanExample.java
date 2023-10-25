package workingWithDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplyLoanExample {
    public static void main(String[] args) {
        // Initialize the WebDriver, open the browser and navigate to the website
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://birdbank.pythonanywhere.com/");
        WebElement loginButton = driver.findElement(By.id("signin_button"));
        loginButton.click();
        driver.findElement(By.id("id_username")).sendKeys("testuser1");
        driver.findElement(By.name("password")).sendKeys("testpassword");
        driver.findElement(By.id("signin")).click();

        // Navigate to the "LOANS" page
        driver.findElement(By.linkText("LOANS")).click();

        // Click on a specific loan option (e.g., "Car Loan")
        driver.findElement(By.xpath("//h5[text()='Car Loan']/following-sibling::span")).click();

        // Locate the "multiple" dropdown and create a Select object
        WebElement docEle = driver.findElement(By.id("basic"));
        Select doc = new Select(docEle);

        // Check if the dropdown allows multiple selections
        System.out.println(doc.isMultiple());
        System.out.println("Printing All Options");

        // Get and print all available options
        List<WebElement> option = doc.getOptions();
        for (WebElement ele : option) {
            System.out.println(ele.getText());
        }

        // Select options from the dropdown
        System.out.println("Selecting Options");
        doc.selectByVisibleText("License");
        doc.selectByVisibleText("Ration card");

        // Get and print all selected options
        System.out.println("Printing All Selected Options");
        List<WebElement> selectedOptions = doc.getAllSelectedOptions();
        for (WebElement ele : selectedOptions) {
            System.out.println(ele.getText());
        }

        // Get and print the first selected option
        System.out.println("Printing First Selected Option");
        System.out.println(doc.getFirstSelectedOption().getText());

        // Deselect an option from the dropdown
        doc.deselectByVisibleText("Ration card");
        System.out.println("After Deselecting, Printing All Selected Options");

        // Get and print all selected options after deselection
        selectedOptions = doc.getAllSelectedOptions();
        for (WebElement ele : selectedOptions) {
            System.out.println(ele.getText());
        }

        // Deselect all options in the dropdown
        doc.deselectAll();
        System.out.println("After Deselecting All, Printing All Selected Options");

        // Get and print all selected options after deselecting all
        selectedOptions = doc.getAllSelectedOptions();
        for (WebElement ele : selectedOptions) {
            System.out.println(ele.getText());
        }

        // Locate a checkbox and select it if it's not already selected
        WebElement checkbox = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }
}
