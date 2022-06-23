import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
    Properties pro;

    public ConfigDataProvider() {
        File src = new File("./config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro =new Properties();
            pro.load(fis);
        }catch (Exception e){
            System.out.println("Config file was not loaded properly");
        }
    }
    public String getBrowser(){
      return  pro.getProperty("Browser");
    }

    public String getURL(){
        return pro.getProperty("qaURL");
    }

    public String getanyProperty(String keyToSearch){
        return pro.getProperty(keyToSearch);
    }

}
