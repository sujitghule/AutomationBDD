package com.autonationpractice.stepdef;

import com.autonationpractice.base.TestContext;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cartpage_stepDef {
	
	
	 TestContext testContext;
     Scenario scn;

     @Before
     public void temp(Scenario s) {
         this.scn = s;
     }

     //Dependency Injections using Pico Container
     public Cartpage_stepDef(TestContext testContext) {
         this.testContext = testContext;
         this.scn = testContext.scn;
     }
	
	
	@When("user_login username {string} and password {string}")
	public void user_login_username_and_password(String username, String password) {
	  testContext.cartpage_pageObjects.login(username, password);
	}


	

	@Then("Move your cursor over Women link and Click on sub menu T-shirts")
	public void move_your_cursor_over_women_link_and_click_on_sub_menu_t_shirts() {
		testContext.cartpage_pageObjects.move_on_women_link_and_click_on_sub_menu_t_shirt();
		
	  
	}
	@Then("Mouse hover on the product displayed and click on More Button")
	public void mouse_hover_on_the_product_displayed_and_click_on_more_button() {
		testContext.cartpage_pageObjects.move_on_product_and_click_on_more_button();
	    
	}
	@Then("Increase quantity  and Select size L and Select color")
	public void increase_quantity_and_select_size_l_and_select_color() {
		testContext.cartpage_pageObjects.inc_qty_2_select_size_L_and_colour();
	  
	}
	@Then("Click Add to Cart button and Click Proceed to checkout button")
	public void click_add_to_cart_button_and_click_proceed_to_checkout_button() {
		testContext.cartpage_pageObjects.click_add_cart_and_proceed_to_checkout();
	
	}
	@Then("Complete the buy order process till payment")
	public void complete_the_buy_order_process_till_payment() {
		testContext.cartpage_pageObjects.Complete_order_process_till_payment();
	    
	}
	@Then("Make sure that Product is ordered")
	public void make_sure_that_product_is_ordered() {
		testContext.cartpage_pageObjects.product_order();
	}




}
