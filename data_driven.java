package seleniumPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class data_driven {
    private WebDriver driver;
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private XSSFCell cell;

    @Test(priority =0)
    public void test_the_page() throws IOException {
        File file = new File("C:\\Users\\prashantb.MKCLINDIA.000\\IdeaProjects\\Selenium_meven_new\\src\\test\\java\\seleniumPackage\\Demo.xlsx");
        FileInputStream fis = new FileInputStream(file);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);
        for(int i = 1; i<=sheet.getLastRowNum();i++ ) {
            cell = sheet.getRow(i).getCell(0);
            DataFormatter formatter = new DataFormatter();
            String username = formatter.formatCellValue(cell);
            cell = sheet.getRow(i).getCell(1);
            String password = formatter.formatCellValue(cell);
            driver.findElement(By.name("username")).sendKeys((username));
            driver.findElement(By.name("password")).sendKeys((password));
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.id("lu-user-image")).click();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//a[contains(text(),'Back to Login')]")).click();
           // String cd = driver.findElement(By.xpath("//h2[contains(text(),'ENROLLED COURSES')]")).getText();
           // Assert.assertEquals(cd, "ENROLLED COURSES");


        }
    }
@BeforeTest
    public void beforetest(){
        driver= new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\chromedriver.exe");
        driver.get("https://eralivestg.mkcl.org");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("hello");
}
}
