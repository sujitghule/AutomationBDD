package com.autonationpractice.stepdef;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.messages.Messages.Hook;

import org.openqa.selenium.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.autonationpractice.base.TestContext;

public class Hooks  extends TestContext{
//    TestContext testContext;
//    WebDriver driver;
    Scenario scn;
    
	private static final Logger logger = LogManager.getLogger(Hook.class);

//    //Dependency Injections using Pico Container
//    public Hooks(TestContext testContext) {
//        this.testContext = testContext;
//        driver = testContext.driver;
//    }

    @Before
    public void setUp(Scenario scn) throws Exception {
        initializeWebDriver();
     intializePageObjects();
//        testContext.scn = scn;
    }

    @After(order = 1)
    public void cleanUp(Scenario scn) {
        quitDriver();
        scn.log("Browser Closed");
    }

    @After(order = 2)
   public void takeScreenShot(Scenario scn) {
     
    	if (scn.isFailed()) {

			TakesScreenshot screenShot = (TakesScreenshot) driver;
			byte[] data = screenShot.getScreenshotAs(OutputType.BYTES);
			scn.attach(data, "image/png", "failed step name ::> " + scn.getName());
			logger.info("Test case isn't passed, screenShot is captured.");
		} else {
			scn.log("Test case is passed, No screenShot is captured.");
			logger.info("Test case is passed, No screenShot is captured.");
		}
    }
	
   }

