package com.damon.base;

import com.damon.util.ReadProperties;
import com.damon.util.TestLog;

public class ReadConfig {

    /**
     * 获取选择的浏览器
     * @return 浏览器名称
     */
    static String getBrowser(){
        return ReadProperties.getprop("config").getString("browserName");
    }

    /**
     * 获取config
     */
    static String getConfig(String configName){
        String configValue =  ReadProperties.getprop("config").getString(configName);
        return configValue;
    }

    /**·
     * 获取element文件
     */
    static String getElement(String elementName){
        return ReadProperties.getprop("element/element").getString(elementName);
    }
}
