package com.damon.base;

import com.damon.util.TestLog;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class BaseDriver{

    WebDriver driver;

    //初始化driver对象/打开浏览器
    public BaseDriver(){

        String browser = ReadConfig.getBrowser();
        TestLog.logger.info("测试浏览器："+browser);

        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "d:\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "edge":
                break;
            case "ie":
                break;
            default:
                break;
        }
        driver.manage().window().maximize();
    }
    //返回driver对象

    public WebDriver getDriver() {
        return driver;
    }

    //延时
    public void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //get方法
    public void get(String urlName){
        driver.get(ReadConfig.getUrl(urlName));
    }

    //findElement By Xpath
    public WebElement findElement(String element){
        return driver.findElement(By.xpath(ReadConfig.getElement(element)));
    }

    //关闭浏览器
    public void quit(){
        driver.quit();
    }

}
