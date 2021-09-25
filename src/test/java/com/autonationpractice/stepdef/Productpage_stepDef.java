package com.autonationpractice.stepdef;

import com.autonationpractice.base.TestContext;

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

public class Productpage_stepDef extends TestContext  {

	Scenario scn;

	@Before
	public void temp(Scenario scn) {
		this.scn = scn;
	}


	@When("Validate {string} option is displayed with all characters in Uppercase")
	public void validate_option_is_displayed_with_all_characters_in_uppercase(String productName) {
		productpage_pageObjects.validateDressesOption(productName);
		scn.log("Displayed all characters in Upper case");
	}

	@When("Click on the DRESS section")
	public void click_on_the_dress_section() {
		productpage_pageObjects.Click_on_the_DRESS_section();

	}
	@Then("Fetch all the prices Make the sum of all products")
	public void fetch_all_the_prices_make_the_sum_of_all_products() {
		productpage_pageObjects.Fetch_all_product_prices();
		scn.log("The sum of all products Match with actual Total");
	}



	@When("user login username {string} and password {string}")
	public void user_login_username_and_password(String username, String password) {
		productpage_pageObjects.login(username, password);  
		scn.log("successfully Login");
	}


	@Then("user click on T-shirt category")
	public void user_click_on_t_shirt_category() {
		productpage_pageObjects.select_T_shirt_category();
	}
	@Then("user click on More")
	public void user_click_on_more() {
		productpage_pageObjects.select_T_shirt_more_option();
	}
	@Then("user click on Send to a Friend")
	public void user_click_on_send_to_a_friend() {
		productpage_pageObjects.click_on_send_to_friend();
	}
	@Then("Fill the details {string} and {string} click on Send button.")
	public void fill_the_details_and_click_on_send_button(String FriendName, String FriendMailID) {
		productpage_pageObjects.fill_deatils_click_on_send_button(FriendName, FriendMailID);

	}
	@Then("user Validate the Message appeared in the Email sent")
	public void user_validate_the_message_appeared_in_the_email_sent() {
		productpage_pageObjects.validate_message();
		scn.log("successfully Send To friend");

	}

	@When("user add three product in cart")
	public void user_add_three_product_in_cart() {
		productpage_pageObjects.add_three_product_in_cart();
		scn.log("successfully Add Three Product In Cart");
	}

	@Then("user validate add same product in cart")
	public void user_validate_add_same_product_in_cart() {
		productpage_pageObjects.validate_add_same_product_in_cart();
		scn.log("successfully Validate Add Same Product In Cart");
	}


	@Then("user validate the cart product value")
	public void user_validate_the_cart_product_value() {
		productpage_pageObjects.validate_cart_product_value();
		scn.log("successfully Validate Cart Product Value");
	}

	@Given("Click on Color Blue link")
	public void click_on_color_blue_link() {
		productpage_pageObjects.click_on_color_blue();

	}

	@Then("Check the Image is changed")
	public void check_the_image_is_changed() {
		productpage_pageObjects.check_image_is_changed();
		scn.log("successfully Image Color Changed");

	}

	@Given("Search for the product {string} in the given search box")
	public void search_for_the_product_in_the_given_search_box(String Dress) {
		productpage_pageObjects.SearchProducSearchBox(Dress);
	}

	@Then("Fetch the result and print the result")
	public void fetch_the_result_and_print_the_result() {
		productpage_pageObjects.fetchResultPrint();
		scn.log("successfully Result Print");
	}

	@When("user remove one product from cart")
	public void user_remove_one_product_from_cart() throws InterruptedException {
	   productpage_pageObjects.remove_one_product();
	   scn.log("Successfully Remove ");
	}



	@Then("user validate the remove product cart value")
	public void user_validate_the_remove_product_cart_value() {
	    productpage_pageObjects.validate_cart();
	    scn.log("Successfully Validate Remove Product In Cart");
	}


}
