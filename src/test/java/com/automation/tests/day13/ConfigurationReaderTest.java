package com.automation.tests.day13;

import com.automation.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class ConfigurationReaderTest {

    @Test
    public void readProperties(){

        String browser= ConfigurationReader.getProperty("browser");
        String url=ConfigurationReader.getProperty("qa1");
        String  color=ConfigurationReader.getProperty("color");


        System.out.println(browser);
        System.out.println(url);
        System.out.println(color);

        String storeManager=ConfigurationReader.getProperty("store_manager");
        String  passWord=ConfigurationReader.getProperty("password");

        System.out.println(storeManager);
        System.out.println(passWord);
    }
}