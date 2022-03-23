package MiniAssignment_2;

import org.checkerframework.checker.units.qual.C;
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
        System.out.println("opened the url "+ driver.getCurrentUrl());

        String PageTitle1= driver.getTitle();
        checktitle(PageTitle1);
    }
    public static void checktitle(String title)
    {
        if(title.contains("PHPTRAVELS")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
