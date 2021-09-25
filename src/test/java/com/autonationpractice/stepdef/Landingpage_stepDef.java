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
//	
//	@When("Send a random email id {string} in newsletter subscription text box")
//	public void send_a_random_email_id_in_newsletter_subscription_text_box(String mailID) {
//	    landingpage_pageObjects.send_random_emailID_in_newsletter_subscription_box(mailID);
//	}
//
//
//
//
//	@When("Click on proceed button")
//	public void click_on_proceed_button() {
//	  landingpage_pageObjects.click_Proceed_Button();
//	}
//	@When("Validate the message text for successful email subscription")
//	public void validate_the_message_text_for_successful_email_subscription() {
//	 landingpage_pageObjects.validate_text_for_successful_email_subscription();
//	}



}
