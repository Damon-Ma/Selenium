package com.damon.base;

import com.damon.util.TestLog;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BaseDriver{

    WebDriver driver;

    //初始化driver对象/打开浏览器
    public BaseDriver(){

        String browser = ReadConfig.getBrowser();
        TestLog.logger.info("---------------Beginning of the test---------------");
        TestLog.logger.info("测试浏览器："+browser);
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", ReadConfig.getConfig(browser));

                //取消chrome正在受到自动化测试软件控制信息栏
                Map<String, Object> prefs = new HashMap<String, Object>();
                //设置提醒的设置，2表示block
                prefs.put("profile.default_content_setting_values.notifications",2);

                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("prefs",prefs);
                options.addArguments("disable-infobars");

                //带参数启动浏览器
                driver = new ChromeDriver(options);
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", ReadConfig.getConfig(browser));
                driver = new FirefoxDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", ReadConfig.getConfig(browser));
                driver = new EdgeDriver();
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver", ReadConfig.getConfig(browser));
                driver = new InternetExplorerDriver();
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
        String url = ReadConfig.getConfig(urlName);
        driver.get(url);
        TestLog.logger.info("测试URL："+url);
    }

    //findElement By Xpath
    public WebElement findElement(String element){
        TestLog.logger.info("定位方法：xpath --> 定位元素："+element);
        return driver.findElement(By.xpath(ReadConfig.getElement(element)));
    }

    //关闭浏览器
    public void quit(){
        driver.quit();
        TestLog.logger.info("---------------End Of Test---------------");
    }

    //查找elements
    public List<WebElement> findElements(String elements){
        return driver.findElements(By.xpath(ReadConfig.getElement(elements)));
    }

    //getUrl,打开新网址
    public void gotoUrl(String url){
        TestLog.logger.info("打开URL："+url);
        driver.get(url);
    }
}
