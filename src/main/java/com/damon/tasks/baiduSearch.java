package com.damon.tasks;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.damon.util.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.*;

public class baiduSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void search(WebDriver dr,String s1){
		dr.findElement(By.xpath(ReadProperties.getprop("element\\element", "baiducontent"))).clear();
		try {
			sleep(2000);
		dr.findElement(By.xpath(ReadProperties.getprop("element\\element", "baiducontent"))).sendKeys(s1);
		dr.findElement(By.xpath(ReadProperties.getprop("element\\element", "baidusearch"))).click();
			sleep(2000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
