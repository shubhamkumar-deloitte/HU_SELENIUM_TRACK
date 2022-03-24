package MiniAssignment_3;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Scenario_4 {
    public static void main(String[] args) throws  InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhamkumar32\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

       launchUrl(driver);
       selectRoundWayTrip(driver);
       selectFlights(driver);
       selectDepartureDate(driver);
       selectPassenger(driver);
       selectReturnDate(driver);
       searchFlights(driver);


       driver.quit();











    }

    public static  void launchUrl(WebDriver driver){

        driver.get("https://www.goibibo.com/");

    }

    public static void selectRoundWayTrip(WebDriver driver) {

        driver.findElement(By.xpath("//ul[@class='sc-fvxzrP cCkBwj']/child::li[2]")).click();
    }
    public static  void selectFlights(WebDriver driver) throws  InterruptedException{
        driver.findElement(By.xpath("//div[@class='sc-fotOHu hmnmkS']/child::div[1]")).click();
        driver.findElement(By.xpath("//div[@class='sc-cidDSM dOEpbS']/child::input")).click();

        driver.findElement(By.xpath("//div[@class='sc-cidDSM dOEpbS']/child::input")).sendKeys("New York");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//ul[@class='sc-caiLqq jnUsvh']/child::li[1]")).click();

       Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/input")).sendKeys("seattle");


       Thread.sleep(1000);

       driver.findElement(By.xpath("//ul[@id='autoSuggest-list']//child::li[2]")).click();
       Thread.sleep(1000);

    }
    public static  void selectDepartureDate(WebDriver driver){
                driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
        driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
        driver.findElement(By.xpath("//div[@aria-label='Fri Jun 24 2022']")).click();
       driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
    }
    public static  void selectPassenger(WebDriver driver) throws InterruptedException {
                driver.findElement(By.xpath("//a[@class='sc-dtMgUX daltrV']")).click();
                Thread.sleep(1000);
    }
    public static void selectReturnDate(WebDriver driver) throws InterruptedException {
                driver.findElement(By.xpath("//p[text()='Click to add a return flight for better discounts']")).click();
        driver.findElement(By.xpath("//div[@aria-label='Fri Jul 08 2022']")).click();
       driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
       Thread.sleep(1500);
    }
    public static void searchFlights(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='sc-dtMgUX daltrV']")).click();
        driver.findElement(By.xpath("//span[@class='sc-fHeRUh jHgPBA']")).click();
        Thread.sleep(3000);
        //String url= driver.getCurrentUrl();
        takeScreenshot(driver);
    }
    public static void takeScreenshot(WebDriver driver){
//

        try {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //The below method will save the screen shot in destination directory with name "screenshot.png"
            FileHandler.copy(scrFile, new File(System.getProperty("user.dir")+"/src/"+"sample.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
