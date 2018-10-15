package com.damon.base;

import com.damon.util.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadConfig {

    /**
     * 获取选择的浏览器
     * @return 浏览器名称
     */
    public static String getBrowser(){
        return ReadProperties.getprop("browser").getString("browserName");
    }

    /**
     * 获取测试url
     */
    public static String getUrl(String urlName){
        return ReadProperties.getprop("url").getString(urlName);
    }

    /**
     * 获取主页element
     */
    public static WebElement getHomeElement(WebDriver dr, String elementName){
        String element =  ReadProperties.getprop("element/home").getString(elementName);
        return dr.findElement(By.xpath(element));
    }

}
