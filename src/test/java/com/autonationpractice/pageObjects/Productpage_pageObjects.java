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
import com.autonationpractice.utilites.Action_utilites;
import com.autonationpractice.utilites.JavaScript_utilites;
import com.autonationpractice.utilites.wait_utilites;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
		action.Dosendkeys(password, Pass_word);
		action.Click(Sign_In);
		
	}

	public void select_T_shirt_category()
	{
		action.Click(t_shirt);
	}

	public void select_T_shirt_more_option()
	{
		action.movetoelement(elementhover);

		action.Click(morebutton);
	}

	public void click_on_send_to_friend()
	{
		action.Click(Send_to_Friend);
	}

	public void fill_deatils_click_on_send_button(String FriendName, String FriendMailID)
	{
		action.Dosendkeys(FriendName, friend_Name);
		action.Dosendkeys(FriendMailID, friendEmail_address);
		action.Click(send_button);
	}

	public void validate_message()
	{
		String sucess="Your e-mail has been sent successfully";
		String name=driver.findElement(By.xpath("//p[normalize-space()='Your e-mail has been sent successfully']")).getText();

		Assert.assertEquals("Your e-mail has been Not sent successfully",sucess,name);
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
		
		logger.info("Sucessfully Add Three Product");

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
	}

	
}
