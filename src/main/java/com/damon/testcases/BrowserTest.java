package com.damon.testcases;

import com.damon.base.BaseDriver;
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

    /**
     *
     * @param s1
     * @param s2
     * @param s3
     * 例如用户表
     * s1 = 用户名
     * s2 = 密码
     * s3 = 预期结果
     * 根据不同的用户名密码断言
     */
	@Test(dataProvider ="testWord")
	public void homeTest(String s1,String s2,String s3){
	    TestLog.logger.info("测试数据1：" + s1
                + " 测试数据2：" + s2
                + " 测试数据3：" + s3);
		BaiduSearch.search(driver, s1);
	}
}
