package com.damon.business;

import com.damon.base.BaseDriver;
import com.damon.handle.HomePageHandle;

public class BaiduSearch {


	public static void search(BaseDriver driver, String s1){
            HomePageHandle.searchBoxClear(driver);
            driver.sleep(2000);
			HomePageHandle.searchBoxSendKey(driver,s1);
            HomePageHandle.searchBtClick(driver);
            driver.sleep(2000);
	}
}
