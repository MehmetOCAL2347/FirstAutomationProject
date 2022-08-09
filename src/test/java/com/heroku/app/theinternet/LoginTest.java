package com.heroku.app.theinternet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://the-internet.herokuapp.com/");

        chromeDriver.manage().window().maximize();
        System.out.println("Driver Baslatildi");
        chromeDriver.quit();

        // id=username
    }

}
