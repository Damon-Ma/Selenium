package com.damon.util;

import com.damon.base.BaseDriver;
import com.damon.cases.BaseCase;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TakeScreenshotListener extends TestListenerAdapter {
    /**
     * 重写失败监听方法
     * @param tr
     */
    @Override
    public void onTestFailure(ITestResult tr) {
        // TODO Auto-generated method stub
        super.onTestFailure(tr);
        // 类名为全类名，包含包名
        String classname = tr.getTestClass().getName();
        // 方法名为执行的方法
        String methodname = tr.getMethod().getMethodName();

        // 此处为获取当前的driver，在BaseCase中创建了BaseDriver对象，然后使用BaseDriver获取WebDriver对象
        WebDriver driver = BaseCase.DRIVER.getDriver();
        TakeScreenshot shot = new TakeScreenshot(driver);
        shot.takeScreenShot(classname, methodname);
    }
}
