package MiniAssignment_2;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Problem_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhamkumar32\\Downloads\\chromedriver.exe");
        WebDriver driver;
        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        System.out.println("Browser window maximized");

        driver.get("https://phptravels.com/demo");
        String parentWindow= driver.getWindowHandle();
        System.out.println("opened the url "+ driver.getCurrentUrl());

        String PageTitle1= driver.getTitle();
        System.out.println("First page Title is "+PageTitle1);
        checktitle(PageTitle1);

        driver.findElement(By.xpath("/html/body/header/div/nav/a[4]")).click();
        String PageTitle2=driver.getTitle();
        System.out.println("Second Page Title is "+PageTitle2);
        CheckBothTitle(PageTitle1,PageTitle2);
        System.out.println("Both Title Checked");

        driver.switchTo().window(parentWindow);
        System.out.println("Navigated back to previous window");
        System.out.println("Url of the current tab is "+ driver.getCurrentUrl());
        driver.findElement(By.xpath("//nav[@class='clearfix']/child::a[2]")).click();

    }
    public static void checktitle(String title)
    {
        if(title.contains("PHPTRAVELS")){
            System.out.println("PASS");
        }else{
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
