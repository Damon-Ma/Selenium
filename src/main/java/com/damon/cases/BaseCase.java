package com.damon.cases;

import com.damon.base.BaseDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseCase {

    public static BaseDriver DRIVER;

    @BeforeTest
    public void openBrowser(){
        DRIVER = new BaseDriver();
    }
    @AfterTest
    public void quit(){
        DRIVER.quit();
    }

}
