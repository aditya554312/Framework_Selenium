import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Base {
    public WebDriver driver;
    public BrowserFactory objBrowserFactory;
    public ConfigDataProvider objConfig;
    XLDataProvider objExcel;
    public ExtentReports report;
    public ExtentTest logger;
    @BeforeSuite
    public void setUpSuite() {

         objBrowserFactory = new BrowserFactory();
         objConfig = new ConfigDataProvider();
         objExcel = new XLDataProvider();

        report = new ExtentReports();


        ExtentSparkReporter extent = new ExtentSparkReporter("C:\\Users\\Ranjan Singh\\reports\\amazon.html");
        report.attachReporter(extent);
    }
    @BeforeClass
    public void setup(){
        driver =objBrowserFactory.instantiateBrowser(objConfig.getBrowser(),objConfig.getURL());
    }
    @AfterMethod
    public void tearDownMethod(ITestResult result){
        if(result.getStatus()==ITestResult.FAILURE) {
            Helper.CaptureScreeshot(driver);
        }
        report.flush();
    }
    @AfterClass
    public void tearDown(){
        objBrowserFactory.tearDown();

    }
}
