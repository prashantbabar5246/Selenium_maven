package seleniumPackage;

import io.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumClass {
    static Object WebElement;
    //Using This COde we can upload data and signing out the browser.

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:4337/o/lfClient/#/login");
        //driver.quit();
        WebElement a = driver.findElement(By.id("loginId"));
        WebElement b = driver.findElement(By.id("password"));
        WebElement c = driver.findElement(By.id("signin"));
        a.sendKeys("12124406");
        b.sendKeys("12124406");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        c.click();
        /*
        String expectedHeading = "We found that you are already having an active session in another browser/tab. Either continue with the same or click on New Login.";

        //Storing the text of the heading in a string
        String heading = driver.findElement(By.xpath("//p[contains(text(),'We found that you are already having an active ses')]")).getText();
        if (expectedHeading.equalsIgnoreCase(heading)) {
            System.out.println("The expected heading is same as actual heading --- " + heading);
            driver.manage().timeouts().wait(20000);
            driver.findElement(By.id("//button[@id='loginbtn']")).click();
            String d = driver.getTitle();
        } else {
            System.out.println("Yes, you are in");

         */
        driver.findElement(By.xpath("//b[contains(text(),'Management')]")).click();
        //driver.findElement(By.xpath("//a[contains(text(),'Health check')]")).click();
        driver.findElement(By.id("link-upload-data")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Upload Data')]")).click();
        System.out.println("Data Upload is successfully started.");
       // driver.manage().timeouts().wait(20000);
        String str = driver.findElement(By.xpath("//div[contains(text(),'Number of files uploaded : 2')]")).getText();
        System.out.println(str);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/section[2]/ul[1]/li[6]/a[1]/span[1]/i[1]")).click();
        driver.quit();
        System.out.println("Browser closed");
    }
}
