package com.autonationpractice.base;

import org.openqa.selenium.By;

public interface Locator {
	
	
	/*
	Use of public Static is another access modifier which can execute or call a method or a variable without using an object.
	 */
	
	
	//-------------------------------------------Cart Page Locator -----------------------------------------------------------
	public static By signIn   				= By.xpath("//a[normalize-space()='Sign in']");
	public static By Email_address   		= By.xpath("//input[@id='email']");
	public static By Pass_word   			= By.xpath("//input[@id='passwd']");
	public static By Sign_In 				= By.xpath("//span[normalize-space()='Sign in']");
	public static By women_locator 			= By.xpath("//a[@title='Women']");
	public static By women_t_shirt_Locator 	= By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//li//a[@title='T-shirts'][normalize-space()='T-shirts']");
	public static By elementhover 			= By.xpath("//div[@class='right-block']");
	public static By morebutton   			= By.xpath("//span[normalize-space()='More']");
	public static By increse_qty_Locator    = By.xpath("//i[@class='icon-plus']");
	public static By select_size  			= By.xpath("//select[@class='form-control attribute_select no-print']");
	public static By select_color 			= By.xpath("//a[@title='Blue']");
	public static By add_cart 				= By.xpath("//span[normalize-space()='Add to cart']");
	public static By checkout_Locator 		= By.xpath("//span[normalize-space()='Proceed to checkout']");
	public static By summary_chekout_Locator 	= By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");
	public static By addresse_chekout_Locator 	= By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]");
	public static By terms_service_Locator 		= By.xpath("//div[@class='checker']//span[@class='checked']//input[@id='cgv']");
	public static By shiping_chekout_Locator 	= By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]");
	public static By payment_Locator 			= By.xpath("//a[@title='Pay by bank wire']");
	public static By confiram_order				= By.xpath("//span[normalize-space()='I confirm my order']");
	public static By order_confiram_Locator 	= By.xpath("//strong[normalize-space()='Your order on My Store is complete.']");
	
	//-------------------------------------------Landing Page Locator -----------------------------------------------------------
	
	public static By youtube_icon			 		= By.xpath("//li[@class='youtube']//a[@target='_blank']");
	public static By ValidateyoutubeHandle_Locator  = By.xpath("//div[@id='text-container']/child::yt-formatted-string[text()='Selenium Framework']");
	public static By facebook_icon 					= By.xpath("//ul//li[@class='facebook']");
	public static By ValidatefacebooHandle_Locator  = By.xpath("//h1[@dir='auto']//span[@dir='auto'][normalize-space()='Selenium Framework']");
	public static By twitter_icon 					= By.xpath("//li[@class='twitter']");
	public static By ValidateTwitterHandle_Locator	= By.xpath("//div[@class='css-1dbjc4n r-1wbh5a2 r-dnmrzs r-1ny4l3l']//span[text()='Selenium Framework']");

	public static By newsletterSubscriptionBox_Locator = By.xpath("//input[@id='newsletter-input']");
	public static By submitNewsletter_Locator = By.xpath("//button[@name='submitNewsletter']");
	public static By ValidateSuccessfulEmailSubscription_Locator = By.xpath("//p[@class='alert alert-success']");
	public static By InvalidEmailSubscription_Locator = By.xpath("//p[@class='alert alert-danger']");
	//-------------------------------------------Product Page Locator -----------------------------------------------------------
	
	
	public static By t_shirt				= By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[1]");
	public static By Send_to_Friend			= By.xpath("//a[normalize-space()='Send to a friend']");
	public static By friend_Name 			= By.xpath("//input[@id='friend_name']");
	public static By friendEmail_address 	= By.xpath("//input[@id='friend_email']");
	public static By send_button 			= By.xpath("//button[@id='sendEmail']//span[contains(text(),'Send')]");
	public static By Product1 				= By.xpath("//ul[@id='homefeatured']//li//div//div//h5//a[contains(text(),'Faded Short Sleeve T-shirts')]");
	public static By Product2 				= By.xpath("//ul[@id='homefeatured']//li//div//div//h5//a[contains(text(),'Blouse')]");
	public static By Product3 				= By.xpath("//ul[@id='homefeatured']//li//div//div//h5//a[contains(text(),'Printed Chiffon Dress')]");
	public static By P_1_addTocart 			= By.xpath("//ul[@id='homefeatured']/li/div/div/div/a[@data-id-product='1']/span");
	public static By P_2_addTocart 			= By.xpath("//ul[@id='homefeatured']/li/div/div/div/a[@data-id-product='2']/span");
	public static By P_3_addTocart 			= By.xpath("//ul[@id='homefeatured']/li/div/div/div/a[@data-id-product='7']/span");
	public static By continueShopping 		= By.xpath("//span[@title='Continue shopping']//span[1]");
	public static By cart 					= By.xpath("//div[@class='shopping_cart']//a");
	public static By cart_box			    = By.xpath("//div[@class='cart_block block exclusive']");
	public static By cartQnty 				= By.xpath("//div[@class='shopping_cart']/a/span[@class='ajax_cart_quantity unvisible']");
	public static By remove_btn 			= By.xpath("//a[@title='Faded Shor...']//parent::dt//span[@class='remove_link']");
	public static By cart_p_1 				= By.xpath("//div[@class='cart-info']//div//a[@title='Faded Short Sleeve T-shirts']");
	public static By cart_p_2 				= By.xpath("//div[@class='cart-info']//div//a[@title='Blouse']");
	public static By cart_p_3 				= By.xpath("//div[@class='cart-info']//div//a[@title='Printed Chiffon Dress']");
	public static By Dresses_locator 		= By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='Dresses']");
	public static By priceOfProduct_locator = By.xpath("//div[@class='right-block']//span[@itemprop='price']");
	public static By ProductView_Locator	= By.xpath("//a[@class='product_img_link']");
	
	public static By productColorBlue_Locator = By.xpath("//ul[@class='color_to_pick_list clearfix']/li/a[@id='color_2']");
	public static By ColorChangeProduct_Locator = By.xpath("//img[@id='bigpic']");
	

	public static By searchBox_Locator = By.xpath("//input[@id='search_query_top']");
	public static By searchBoxSuggestion_Locator = By.xpath("//div[@class='ac_results']//li");
}
