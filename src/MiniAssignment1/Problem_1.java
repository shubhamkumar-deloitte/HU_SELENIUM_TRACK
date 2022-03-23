package MiniAssignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubhamkumar32\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/hotels");
    }
        //xpath of home-//a[text()='Home']
        //xpath of Flights=//a[@class=' waves-effect'][@href='https://phptravels.net/flights']
    //xpath of tours=//a[@title=' waves-effect'][@href='https://phptravels.net/tours']
    //xpath of company=//a[@class=' waves-effect'][@href='company'][text()='Company ']
    //xpath of signup button-//a[@class='theme-btn theme-btn-small waves-effect']
    //xpath of login button-//a[@class='theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect']
    //xpath of agents drop down=//button[@id='agents']

    //absolute path
    //Flights-html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a
    //tours-/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[4]/a
    //company-/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[8]/a
    //signup-Signup Btn	//*[@id="fadein"]/header/div[1]/div/div/div[2]/div/div/a[1]	/html/body/header/div[1]/div/div/div[2]/div/div/a[1]
    //login-/html/body/header/div[1]/div/div/div[2]/div/div/a[2]
    //agents-/html/body/header/div[1]/div/div/div[2]/div/div/div[4]/div/button
    }

