package com.autonationpractice.stepdef;

import com.autonationpractice.base.TestContext;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Sujit k. Ghule
 * @Description: Test com.automationPractice-BDD FW development
 * @see @following script is the automation testing simulation for the
 *      Application - "http://automationpractice.com/index.php?"
 */

public class Cartpage_stepDef extends TestContext {


	Scenario scn;

	@Before
	public void temp(Scenario scn) {
		this.scn = scn;
	}


	@When("user_login username {string} and password {string}")
	public void user_login_username_and_password(String username, String password) {
		cartpage_pageObjects.login(username, password);
		scn.log("successfully Login");
	}


	@Then("Move your cursor over Women link and Click on sub menu T-shirts")
	public void move_your_cursor_over_women_link_and_click_on_sub_menu_t_shirts() {
		cartpage_pageObjects.move_on_women_link_and_click_on_sub_menu_t_shirt();


	}
	@Then("Mouse hover on the product displayed and click on More Button")
	public void mouse_hover_on_the_product_displayed_and_click_on_more_button() {
		cartpage_pageObjects.move_on_product_and_click_on_more_button();

	}
	@Then("Increase quantity  and Select size L and Select color")
	public void increase_quantity_and_select_size_l_and_select_color() {
		cartpage_pageObjects.inc_qty_2_select_size_L_and_colour();
		

	}
	@Then("Click Add to Cart button and Click Proceed to checkout button")
	public void click_add_to_cart_button_and_click_proceed_to_checkout_button() {
		cartpage_pageObjects.click_add_cart_and_proceed_to_checkout();
		scn.log("Successfully Add In Cart");

	}
	@Then("Complete the buy order process till payment")
	public void complete_the_buy_order_process_till_payment() {
		cartpage_pageObjects.Complete_order_process_till_payment();
		scn.log("Successfully Payment Method Done");

	}
	@Then("Make sure that Product is ordered")
	public void make_sure_that_product_is_ordered() {
		cartpage_pageObjects.product_order();
		scn.log("Successfully Order Done");
	}

	


}
