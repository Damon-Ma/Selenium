package com.damon.business;

import com.damon.base.BaseDriver;
import com.damon.handle.NewsPageHandle;

public class NewsSearch {

    public static void searchNews(BaseDriver driver, String s1){
        NewsPageHandle.searchBoxClear(driver);
        driver.sleep(2000);
        NewsPageHandle.searchBoxSendKey(driver,s1);
        NewsPageHandle.searchBtClick(driver);
        driver.sleep(2000);
    }
}
