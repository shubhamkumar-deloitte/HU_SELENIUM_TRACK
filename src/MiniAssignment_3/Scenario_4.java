package MiniAssignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Scenario_4 {
    public static void main(String[] args) throws  InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhamkumar32\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.goibibo.com/");
        driver.findElement(By.xpath("//ul[@class='sc-fvxzrP cCkBwj']/child::li[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div/div")).click();
        driver.findElement(By.xpath("//div[@class='sc-cidDSM dOEpbS']/child::input")).click();
        driver.findElement(By.xpath("//div[@class='sc-cidDSM dOEpbS']/child::input")).sendKeys("New York");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/ul/li[1]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/input")).sendKeys("seattle");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"autoSuggest-list\"]/li[1]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]/div[6]/p")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[5]/div[2]/div[3]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/div[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div[2]/div[3]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[5]/div[2]/div[3]/a[2]")).click();
        driver.findElement(By.xpath("//span[@class='sc-fHeRUh jHgPBA']")).click();

//        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/div")).click();
//        driver.findElement(By.xpath("//div[@class='sc-cidDSM dOEpbS']/child::input")).click();
//     driver.findElement(By.xpath("//div[@class='sc-cidDSM dOEpbS']/child::input")).sendKeys("Seattle");
//     Thread.sleep(1000);
//     driver.findElement(By.xpath("//*[@id=\"autoSuggest-list\"]/li[1]/div")).click();

    }

}
