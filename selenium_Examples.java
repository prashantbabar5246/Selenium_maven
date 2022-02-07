package seleniumPackage;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class selenium_Examples {
    WebDriver driver;
    WebDriverWait wait;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
    public void Setup() {
        // Set the path of the Firefox driver.
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();

        // Enter url.
        driver.get("https://eralivestg.mkcl.org/#/");
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, 30);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void ReadData()throws IOException, Exception{
            //Import Excel Sheet
        File src = new File("D:\\Demo.xlsx");
            FileInputStream fis = new FileInputStream(src);
            workbook = new XSSFWorkbook(fis);
            sheet= workbook.getSheet("Sheet1");
            for(int i=1; i<=sheet.getLastRowNum(); i++){
            cell = sheet.getRow(i).getCell(0);
            driver.findElement(By.xpath("//input[@id='username']")).clear();
            driver.findElement(By.xpath("//input[@id='username']")).sendKeys(cell.getStringCellValue());

            cell = sheet.getRow(i).getCell(1);
            driver.findElement(By.xpath("//input[@id='password']")).clear();
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(cell.getStringCellValue());

            driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
                //To write data in the excel
                FileOutputStream fos=new FileOutputStream(src);
                boolean message = false;
                sheet.getRow(i).createCell(2).setCellValue(message);
                workbook.write(fos);

                driver.findElement(By.xpath("//button[@id='redirectionBtn']")).click();
        }
    }
}
