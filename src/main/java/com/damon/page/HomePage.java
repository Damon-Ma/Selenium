package com.damon.page;

import com.damon.base.ReadConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    //获取输入框
    public static WebElement searchBoxElement(WebDriver dr){
        return ReadConfig.getHomeElement(dr,"baiducontent");
    }
    //获取搜索按钮
    public static WebElement searchBtElement(WebDriver dr){
        return ReadConfig.getHomeElement(dr,"baidusearch");
    }
}
