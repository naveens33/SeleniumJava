package workingWithBrowsers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserExample {
    public static void main(String[] args){
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveen S\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://birdbank.pythonanywhere.com/");
    }
}
