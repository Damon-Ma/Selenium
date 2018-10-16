package com.damon.page;

import com.damon.base.BaseDriver;
import org.openqa.selenium.WebElement;

public class NewsPage {
    //获取输入框
    public static WebElement searchBoxElement(BaseDriver driver){
        return driver.findElement("newscontent");
    }
    //获取搜索按钮
    public static WebElement searchBtElement(BaseDriver driver){
        return driver.findElement("newssearch");
    }
}
