package com.autonationpractice.pageObjects;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.autonationpractice.base.Locator;
import com.autonationpractice.base.TestContext;
import com.autonationpractice.base.Variables;
import io.cucumber.java.Scenario;

/**
 * @author Sujit k. Ghule
 * @Description: Test com.automationPractice-BDD FW development
 */

public class Landingpage_pageObjects extends TestContext  implements Locator,Variables {

	private static final Logger logger = LogManager.getLogger(Landingpage_pageObjects.class);
	WebDriver driver;
	WebDriverWait wait;
	Scenario scn;

	public Landingpage_pageObjects(WebDriver driver, WebDriverWait wait, Scenario scn) 
	{
		this.driver = driver;
		this.wait =wait;
		this.scn=scn; 
	}

	public void Youtube()
	{
		javaScript_util.scrollPageDown();
		action.Click(youtube_icon);
		action.windowHandlle();
		System.out.println(driver.getCurrentUrl());


		action.asserting("Not match Facebook","Match FaceBook", Youtubemessage,action.GetText(ValidateyoutubeHandle_Locator));
		
		logger.info("Customer succefully visited Youtube");
	}

	public void Facebook() 
	{

		action.Click(facebook_icon);
		action.windowHandlle();
		System.out.println(driver.getCurrentUrl());

		action.asserting("Not match Youtube","Match Youtube", FaceBookmessage,action.GetText(ValidatefacebooHandle_Locator));
		
		logger.info("Customer succefully visited Facebook");
	}
	public void Twitter()
	{

		action.Click(twitter_icon);
		action.windowHandlle();
		System.out.println(driver.getCurrentUrl());

		action.asserting("Not match Twitter","Match Twitter", Twittermessage,action.GetText(ValidateTwitterHandle_Locator));
		
		logger.info("Customer succefully visited Twitter");
	}


}
