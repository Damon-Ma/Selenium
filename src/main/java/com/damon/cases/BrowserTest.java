package com.damon.cases;

import com.damon.base.ReadConfig;
import com.damon.business.baiduSearch;
import com.damon.base.Browser;
import com.damon.util.RangeDatabyPOI;
import com.damon.util.TestLog;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

public class BrowserTest {
	WebDriver dr;

	//读取excel中的数据作为测试数据
	@DataProvider(name="testWord")
	public Object[][] getData() {
		String filepath="D:\\Excel\\test.xlsx";
		Object[][] array= RangeDatabyPOI.poiRangeData(filepath);
		return array;
	}
	
	@BeforeTest
	public void beforetest(){
	    String testUrl = ReadConfig.getUrl("home");

		dr=Browser.openBrowser(dr);
        TestLog.logger.info("测试地址："+testUrl);
		dr.get(testUrl);

	}
	

	@Test(dataProvider ="testWord")
	public void browser(String s1,String s2,String s3){
	    TestLog.logger.info("测试数据1：" + s1
                + " 测试数据2：" + s2
                + " 测试数据3：" + s3);
		baiduSearch.search(dr, s1);
	}
	
	@AfterTest
	public void quit(){
		Browser.closeBrowser(dr);
	}
	
	
}
