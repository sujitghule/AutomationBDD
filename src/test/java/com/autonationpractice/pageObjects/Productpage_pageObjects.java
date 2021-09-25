package com.autonationpractice.pageObjects;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.autonationpractice.base.Locator;
import com.autonationpractice.base.TestContext;
import com.autonationpractice.base.Variables;


import io.cucumber.java.Scenario;

/**
 * @author Sujit k. Ghule
 * @Description: Test com.automationPractice-BDD FW development
 */

public class Productpage_pageObjects  extends TestContext implements Locator, Variables{
	private static final Logger logger = LogManager.getLogger(Productpage_pageObjects.class);

	WebDriver driver;
	WebDriverWait wait;
	Scenario scn;

	public Productpage_pageObjects(WebDriver driver, WebDriverWait wait, Scenario scn) 
	{
		this.driver = driver;
		this.wait =wait;
		this.scn=scn; 

	}

	public void validateDressesOption(String productName) {
		WebElement element = driver.findElement(Dresses_locator);

		Assert.assertEquals(productName, element.getText());

	}


	public void Click_on_the_DRESS_section()
	{
		action.Click(Dresses_locator);
	}

	public void Fetch_all_product_prices()
	{
		List<WebElement> price = driver.findElements(priceOfProduct_locator);
		float price_total = 0.00f;
		float Expected_Total = 152.87f;

		for (int i = 0; i < price.size(); i++) {
			javaScript_util.scrollIntoView_ByLocator(ProductView_Locator);
			javaScript_util.drawBorder_ByElement(price.get(i));
			price_total = price_total + Float.parseFloat(price.get(i).getText().substring(1));
		}
		Assert.assertEquals("Product price total are not match", Expected_Total, price_total, Expected_Total);
		logger.info("The sum of all products Match with actual Total");
	}


	public void login(String username, String password)
	{
		action.Click(signIn);
		action.Dosendkeys(username, Email_address);
		logger.info("Enter mail id ::> " + username);
		action.Dosendkeys(password, Pass_word);
		logger.info("Enter password ::> " + password);
		action.Click(Sign_In);
		logger.info("click on SignIn Button.");

	}

	public void select_T_shirt_category()
	{
		action.Click(t_shirt);
		logger.info("select T-shirts option.");
	}

	public void select_T_shirt_more_option()
	{
		action.movetoelement(elementhover);
		action.Click(morebutton);
		logger.info("select More option.");
	}

	public void click_on_send_to_friend()
	{
		action.Click(Send_to_Friend);
	}

	public void fill_deatils_click_on_send_button(String FriendName, String FriendMailID)
	{
		action.Dosendkeys(FriendName, friend_Name);
		logger.info("enter Friend Name ::> " + FriendName);
		action.Dosendkeys(FriendMailID, friendEmail_address);
		logger.info("enter Friend Mail ID ::> " + FriendMailID);

		action.Click(send_button);
		logger.info("Click on Send button.");
	}

	public void validate_message()
	{
		String sucess="Your e-mail has been sent successfully";
		String name=driver.findElement(By.xpath("//p[normalize-space()='Your e-mail has been sent successfully']")).getText();

		Assert.assertEquals("Your e-mail has been Not sent successfully",sucess,name);
		logger.info("Send E-mail Successfully");

	}

	public void add_three_product_in_cart() 
	{
		action.movetoelement(Product1);
		action.Click(P_1_addTocart);
		action.Click(continueShopping);
		logger.info("First Product Add");

		action.movetoelement(Product2);
		action.Click(P_2_addTocart);
		action.Click(continueShopping);
		logger.info("Second Product Add");

		action.movetoelement(Product3);
		action.Click(P_3_addTocart);
		action.Click(continueShopping);
		logger.info("Third Product Add");

		logger.info(" Add Three Product In Cart");

	}

	public void validate_cart_product_value()
	{
		action.asserting("Cart qnty is not 3", "Cart qnty is 3", "3", action.GetText(cartQnty));
		logger.info("Cart Product Value Same");
	}

	public void validate_add_same_product_in_cart()
	{
		action.asserting("Product one is not verified", "Product one is verified successfully",product1, action.getAttribute(cart_p_1,"title"));
		action.asserting("Product two is not verified", "Product two is verified successfully",product2, action.getAttribute(cart_p_2,"title"));
		action.asserting("Product three is not verified", "Product three is verified successfully",product3, action.getAttribute(cart_p_3,"title"));
		logger.info("Same Product In Cart");
	}

	public void click_on_color_blue() {
		javaScript_util.scrollIntoView_ByLocator(ProductView_Locator);
		action.movetoelement(productColorBlue_Locator);
		action.Click(productColorBlue_Locator);

		logger.info("Click on blue color.");
	}
	public void check_image_is_changed() {
		javaScript_util.scrollIntoView_ByLocator(ColorChangeProduct_Locator);
		wait_util.waitForElementPresent(ColorChangeProduct_Locator);
		WebElement ele = driver.findElement(ColorChangeProduct_Locator);
		Assert.assertTrue(ele.isDisplayed());
		logger.info("Assertion completed and product color is changed.");
	}
	public void SearchProducSearchBox(String Text) {
		action.Dosendkeys(Text,searchBox_Locator);
		logger.info("Search for the product “Dress” in the search box.");
	}
	public void fetchResultPrint() {
		wait_util.waitForElementClickable(searchBoxSuggestion_Locator);
		List<WebElement> elements = driver.findElements(searchBoxSuggestion_Locator);
		logger.info("All product get displayed in the list with names ::>");

		for (int i = 0; i < elements.size(); i++) 
		{
			logger.info("                                           " + (i + 1) + ") " + elements.get(i).getText());
		}

		Assert.assertEquals(7, elements.size());
		logger.info("Validate with the Expected result as 7 => " + "Actual Result :: " + elements.size());
	}
	
	public void remove_one_product() throws InterruptedException
	{
		action.movetoelement(cart);
		wait_util.waitForElementPresent(cart_box);
		wait_util.waitForElementPresent(remove_btn);
		action.Click(remove_btn);
		Thread.sleep(5000);
	   logger.info("click on cross button to remove product from cart.");
		
	}
public void validate_cart()
{
	action.asserting("Cart qnty is not 2", "Cart qnty is 2", "2", action.GetText(cartQnty));
	logger.info("Validate the cart count After remove product as");
}
}
