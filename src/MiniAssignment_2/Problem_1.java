package MiniAssignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem_1 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhamkumar32\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://phptravels.com/demo");

        Thread.sleep(1000);
        String parentWindow= driver.getWindowHandle();

        String pageTitle= driver.getTitle();
        //System.out.println("fist page title"+pageTitle);
        checkTitle(pageTitle);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/header/div/nav/a[4]")).click();
        String secondPageTitle= driver.getTitle();
        //System.out.println("second page title"+secondPageTitle);
        CheckBothTitle(pageTitle,secondPageTitle);
        Thread.sleep(2000);
        driver.switchTo().window(parentWindow);
        System.out.println("printing the current url "+driver.getCurrentUrl());
        driver.findElement(By.xpath("//nav[@class='clearfix']/child::a[2]")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.quit();



        //driver.quit();
    }

    public static void checkTitle(String pageTitle)
    {
        if(pageTitle.contains("PHPTRAVELS"))
        {
            System.out.println("PASS");
        }else
        {
            System.out.println("FAIL");
        }
    }
    public static void CheckBothTitle(String title1,String title2)
    {
        //System.out.println(title1.equals(title2));
        if(title1.equals(title2))
        {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
