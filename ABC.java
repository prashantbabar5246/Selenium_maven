package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ABC {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\chromedriver.exe");
        driver.get("https://www.guru99.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //Absolute xpath
       // driver.findElement(By.xpath("//a[contains(text(),'➤ Software Testing')]")).click();
        //Relative x path
        driver.findElement(By.xpath("//a[contains(text(),'➤ Software Testing')]")).click();
        System.out.println("done");

    }
}
