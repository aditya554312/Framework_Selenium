import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class XLDataProvider {
    FileInputStream fis;

    XSSFWorkbook wb;
    public XLDataProvider() {

        {
            try {
                File src = new File("C:\\Users\\Ranjan Singh\\xl_data_provider\\XL_Data_Provider.xlsx");
                fis = new FileInputStream(src);
                wb = new XSSFWorkbook(fis);
            } catch (IOException e) {
                System.out.println("Unable to load excel sheet" + e.getMessage());
            }
        }
    }

    public String getData(){
      return wb.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
    }

}
