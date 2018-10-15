package com.damon.handle;

import com.damon.page.HomePage;
import org.openqa.selenium.WebDriver;

public class HomePageHandle {
    //清空
    public static void searchBoxClear(WebDriver driver){
        HomePage.searchBoxElement(driver).clear();
    }
    //输入
    public static void searchBoxSendKey(WebDriver driver,String s1){
        HomePage.searchBoxElement(driver).sendKeys(s1);
    }
    //点击搜索
    public static void searchBtClick(WebDriver driver){
        HomePage.searchBtElement(driver).click();
    }
}
