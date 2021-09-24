package com.autonationpractice.stepdef;



import com.autonationpractice.base.TestContext;
import com.autonationpractice.base.WebDriverFactory;
import com.autonationpractice.pageObjects.Landingpage_pageObjects;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Landingpage_stepDef  {
	 TestContext testContext;
     public Scenario scn;

     @Before
     public void temp(Scenario s) {
         this.scn = s;
     }

     //Dependency Injections using Pico Container
     public Landingpage_stepDef(TestContext testContext) {
         this.testContext = testContext;
         this.scn = testContext.scn;
     }

	@Given("User open the browser")
	public void user_open_the_browser() {
		WebDriverFactory.navigateToTheUrl(testContext.base_url);
	}

	@Then("user verify that successfully visited Youtube page")
	public void user_verify_that_successfully_visited_youtube_page() {
	   testContext.landingpage_pageObjects.Youtube();
	   scn.log("Customer succefully visited Youtube");
	}
	

	@Then("user verify that successfully visited Twitter page")
	public void user_verify_that_successfully_visited_twitter_page() {
	    testContext.landingpage_pageObjects.Twitter();
	    scn.log("Customer succefully visited Twitter");
	}
	

	@Then("user verify that successfully visited fb page")
	public void user_verify_that_successfully_visited_fb_page() {
	   testContext.landingpage_pageObjects.Facebook();
	   scn.log("Customer succefully visited Facebook");
	}
	



}
