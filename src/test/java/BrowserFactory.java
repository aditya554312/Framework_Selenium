import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BrowserFactory {
    public WebDriver driver;

    public WebDriver instantiateBrowser(String browserName, String url){
        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else {
            Reporter.log("We don't support this browser at the moment");
        }
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

    public void tearDown(){
        driver.quit();
    }
}
