package workingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserExample {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://birdbank.pythonanywhere.com/");
    }
}
