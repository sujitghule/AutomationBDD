package com.autonationpractice.stepdef;

import com.autonationpractice.base.TestContext;
import com.autonationpractice.base.WebDriverFactory;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Sujit k. Ghule
 * @Description: Test com.automationPractice-BDD FW development
 * @see @following script is the automation testing simulation for the
 *      Application - "http://automationpractice.com/index.php?"
 */

public class Landingpage_stepDef extends TestContext {
	
	Scenario scn;

	@Before
	public void temp(Scenario scn) {
		this.scn = scn;
	}

	@Given("User open the browser")
	public void user_open_the_browser() {
		WebDriverFactory.navigateToTheUrl(base_url);
	}

	@Then("user verify that successfully visited Youtube page")
	public void user_verify_that_successfully_visited_youtube_page() {
	 landingpage_pageObjects.Youtube();
	   scn.log("Customer succefully visited Youtube");
	}
	

	@Then("user verify that successfully visited Twitter page")
	public void user_verify_that_successfully_visited_twitter_page() {
	landingpage_pageObjects.Twitter();
	    scn.log("Customer succefully visited Twitter");
	}
	

	@Then("user verify that successfully visited fb page")
	public void user_verify_that_successfully_visited_fb_page() {
	  landingpage_pageObjects.Facebook();
	   scn.log("Customer succefully visited Facebook");
	}



}
