import org.testng.annotations.Test;

public class AmazonTest extends Base {
    AmazonPage objAmazonPage=new AmazonPage();

    @Test
    public void topNavClick(){
        //report.createTest("amazon homepage");
        //logger.info("Starting application");
        objAmazonPage.clickTopNav(driver);
        String temp= objExcel.getData();
        System.out.println(temp);
        //logger.info("clicked mobile in top navigation");hello

    }
}
