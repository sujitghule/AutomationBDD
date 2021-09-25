package com.autonationpractice.base;

import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.autonationpractice.pageObjects.Cartpage_pageObjects;
import com.autonationpractice.pageObjects.Landingpage_pageObjects;
import com.autonationpractice.pageObjects.Productpage_pageObjects;
import com.autonationpractice.utilites.Action_utilites;
import com.autonationpractice.utilites.JavaScript_utilites;
import com.autonationpractice.utilites.wait_utilites;



public class TestContext {
    public WebDriver driver;
    public WebDriverWait wait;
    public Scenario scn;
    public String base_url = "http://automationpractice.com/index.php?";
    public int implicit_wait_timeout_in_sec = 20;
    
    
    public static Action_utilites action;
    public static wait_utilites wait_util;
    public static JavaScript_utilites javaScript_util;

    public static Landingpage_pageObjects landingpage_pageObjects;
    public static Cartpage_pageObjects cartpage_pageObjects;
    public static Productpage_pageObjects productpage_pageObjects;
   
	private static final Logger logger = LogManager.getLogger(TestContext.class);
	
    public void initializeWebDriver() throws Exception {
        //Get the browser name by default it is chrome
        String browserName = WebDriverFactory.getBrowserName();
        driver = WebDriverFactory.getWebDriverForBrowser(browserName)  ;
        logger.info("Browser invoked.");
    }

    public void quitDriver(){
        driver.quit();
        logger.info("Browser quit.");
    }
    
    public void intializePageObjects(){
    	
    	wait =new WebDriverWait(driver, 30);
    	action = new Action_utilites(driver, wait, scn);
    	wait_util = new wait_utilites(driver, wait);
    	javaScript_util = new JavaScript_utilites(driver, wait, scn);
    	landingpage_pageObjects = new Landingpage_pageObjects(driver, wait, scn);
    	cartpage_pageObjects = new Cartpage_pageObjects(driver, wait, scn);
    	productpage_pageObjects = new Productpage_pageObjects(driver, wait, scn);
    }
}


