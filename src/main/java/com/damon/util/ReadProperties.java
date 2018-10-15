package com.damon.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;


/**
 * 
 * @author renjy
 */
public class ReadProperties {

	/**
	 * 根据文件名称、获取对应Bundle
	 * 默认在resources目录下寻找properties文件
	 * 只需传相对路径和文件名，不需要扩展名
	 */
	public static ResourceBundle getprop(String filename){
       return ResourceBundle.getBundle(filename,Locale.CHINA);
	}
}