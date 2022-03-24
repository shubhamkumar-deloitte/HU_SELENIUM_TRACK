package MiniAssignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhamkumar32\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame("demo-frame");
        Actions builder=new Actions(driver);
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement dest=driver.findElement(By.id("droppable"));

        builder.dragAndDrop(source,dest).build().perform();

        System.out.println(source.getText());
    }
}
