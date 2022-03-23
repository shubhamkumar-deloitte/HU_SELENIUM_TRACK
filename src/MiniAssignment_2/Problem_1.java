package MiniAssignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem_1 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhamkumar32\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://phptravels.com/demo");

        String pageTitle= driver.getTitle();
        //System.out.println(pageTitle);
        checkTitle(pageTitle);
        driver.quit();
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
}
