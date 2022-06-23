import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

    public static void CaptureScreeshot(WebDriver driver){

        try {
        File destinationFile = new File("C:\\Users\\Ranjan Singh\\Screenshot\\"+ getDate() +".png");
        TakesScreenshot screenShot = (TakesScreenshot)driver;
        File srcFile = screenShot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile,destinationFile);
            System.out.println("Screenshot captured");

        } catch (IOException e) {
            System.out.println("Screenshot not captured"+e.getMessage());
        }

    }
    public static String getDate(){
      DateFormat objFormat =new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
        Date currentDate = new Date();
       return objFormat.format(currentDate);

    }
}
