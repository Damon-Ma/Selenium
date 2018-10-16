package com.damon.cases;

import com.damon.base.BaseDriver;
import com.damon.base.ReadConfig;
import com.damon.business.BaiduSearch;
import com.damon.util.RangeDatabyPOI;
import com.damon.util.TestLog;
import org.testng.annotations.*;

public class BrowserTest {

    private BaseDriver driver;

	//读取excel中的数据作为测试数据
	@DataProvider(name="testWord")
	public Object[][] getData() {
		String filepath="D:\\Excel\\test.xlsx";
        return RangeDatabyPOI.poiRangeData(filepath);
	}

	@BeforeClass
	public void openUrl(){
	    driver = BaseCase.DRIVER;
        driver.get("home");
	}

	@Test(dataProvider ="testWord")
	public void homeTest(String s1,String s2,String s3){
	    TestLog.logger.info("测试数据1：" + s1
                + " 测试数据2：" + s2
                + " 测试数据3：" + s3);
		BaiduSearch.search(driver, s1);
	}


	
	
}
