package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();

        //Using Alert class to first switch to or focus to the alert box
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("abc");
        driver.findElement(By.linkText("Cancel")).click();
    }
}
