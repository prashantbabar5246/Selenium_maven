package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Static.html");
        WebElement from = driver.findElement(By.xpath("//img[@id='mongo']"));
        WebElement to = driver.findElement(By.xpath("//div[@id='droparea']"));
        //Actions Class
        Actions act = new Actions(driver);
        System.out.println("Action class performed");
        act.dragAndDrop(from,to).build().perform();

    }
}
