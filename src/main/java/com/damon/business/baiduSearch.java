package com.damon.business;

import com.damon.base.ReadConfig;
import com.damon.handle.HomePageHandle;
import com.damon.page.HomePage;
import com.damon.util.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.*;

public class baiduSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void search(WebDriver dr,String s1){
		try {
            HomePageHandle.searchBoxClear(dr);
			sleep(2000);
			HomePageHandle.searchBoxSendKey(dr,s1);
            HomePageHandle.searchBtClick(dr);
			sleep(2000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
