package com.damon.handle;

import com.damon.base.BaseDriver;
import com.damon.page.NewsPage;

public class NewsPageHandle {
    //清空
    public static void searchBoxClear(BaseDriver driver){
        NewsPage.searchBoxElement(driver).clear();
    }
    //输入
    public static void searchBoxSendKey(BaseDriver driver,String s1){
        NewsPage.searchBoxElement(driver).sendKeys(s1);
    }
    //点击搜索
    public static void searchBtClick(BaseDriver driver){
        NewsPage.searchBtElement(driver).click();
    }
}
