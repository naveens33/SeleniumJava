package workingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {
    public static void main(String[] args){
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveen S\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //options.setBrowserVersion("115");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.addArguments("--user-data-dir=" +"C:\\Users\\Naveen S\\AppData\\Local\\Google\\Chrome\\User Data");
        options.addArguments("--profile-directory=Profile 7");
        WebDriver driver = new ChromeDriver(options);
        driver.get("C:\\Users\\Naveen S\\IdeaProjects\\SeleniumJavaTesting\\src\\workingWithBrowser\\notification.html");
    }
}
