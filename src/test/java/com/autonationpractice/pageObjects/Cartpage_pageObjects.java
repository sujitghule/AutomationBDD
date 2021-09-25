package com.autonationpractice.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

public class Cartpage_pageObjects extends TestContext implements Locator,Variables {

	private static final Logger logger = LogManager.getLogger(Cartpage_pageObjects.class);
	
	WebDriver driver;
	WebDriverWait wait;
	Scenario scn;

	public Cartpage_pageObjects(WebDriver driver, WebDriverWait wait, Scenario scn)
	{
		this.driver = driver;
		this.wait =wait;
		this.scn=scn; 
	}
	
	
	public void login(String username, String password)
	{
		javaScript_util.drawBorder_Bylocator(signIn);
		action.Click(signIn);
		action.Dosendkeys(username, Email_address);
		logger.info("Enter mail id ::> " + username);
		action.Dosendkeys(password, Pass_word);
		logger.info("Enter password ::> " + password);
		action.Click(Sign_In);
		logger.info("click on SignIn Button.");
		
		
	}
	public void move_on_women_link_and_click_on_sub_menu_t_shirt()
	{
		
		action.movetoelement(women_locator);
		javaScript_util.drawBorder_Bylocator(women_t_shirt_Locator);
		action.Click(women_t_shirt_Locator);
	}
	public void move_on_product_and_click_on_more_button()
	{
		action.movetoelement(elementhover);
		javaScript_util.drawBorder_Bylocator(morebutton);
		action.Click(morebutton);
	}
	public void inc_qty_2_select_size_L_and_colour()
	{
		action.Click(increse_qty_Locator);
		action.dropdown("L", select_size);
		action.Click(select_color);
		logger.info("Customer select quantity and size");
		
	}
	public void click_add_cart_and_proceed_to_checkout()
	{
		action.Click(add_cart);
		action.Click(checkout_Locator);;
	}
	public void Complete_order_process_till_payment() 
	{
		action.Click(summary_chekout_Locator);
		action.Click(addresse_chekout_Locator);
		wait_util.waitForElementClickable(terms_service_Locator);
		action.Click(terms_service_Locator);
		action.Click(shiping_chekout_Locator);
		action.Click(payment_Locator);
		action.Click(confiram_order);
		logger.info("Payment done");
		
	}
	public void product_order()
	{
		javaScript_util.drawBorder_Bylocator(Dresses_locator);
		action.asserting("order not done","order done",order_confiram, action.GetText(order_confiram_Locator));
		scn.log("Order successfully done");
		logger.info("Order successfully done");
	}
	

}
