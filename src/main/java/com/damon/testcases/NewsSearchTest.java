package com.damon.testcases;

import com.damon.base.BaseDriver;
import com.damon.business.NewsSearch;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewsSearchTest {

    private BaseDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = BaseCase.DRIVER;
        driver.get("news");
    }

    @Test
    public void newsTest(){
        NewsSearch.searchNews(driver,"美国");
    }
}
