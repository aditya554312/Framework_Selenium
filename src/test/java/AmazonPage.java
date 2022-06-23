import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPage {
    WebDriver driver;
    public static String Top_Nav_Mob ="//a[text()='Mobiles']";

   // public AmazonPage(WebDriver locdriver){
     //   this.driver= locdriver;
    //}

    public void clickTopNav(WebDriver driver){
        WebElement locTopNav_Mob = driver.findElement(By.xpath(Top_Nav_Mob));
        locTopNav_Mob.click();
    }
}
