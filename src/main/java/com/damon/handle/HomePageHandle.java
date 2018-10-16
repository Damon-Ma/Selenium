package com.damon.handle;

import com.damon.base.BaseDriver;
import com.damon.page.HomePage;

public class HomePageHandle {
    //清空
    public static void searchBoxClear(BaseDriver driver){
        HomePage.searchBoxElement(driver).clear();
    }
    //输入
    public static void searchBoxSendKey(BaseDriver driver,String s1){
        HomePage.searchBoxElement(driver).sendKeys(s1);
    }
    //点击搜索
    public static void searchBtClick(BaseDriver driver){
        HomePage.searchBtElement(driver).click();
    }
}
