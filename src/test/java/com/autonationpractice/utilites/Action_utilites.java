package com.autonationpractice.utilites;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.autonationpractice.base.TestContext;

import io.cucumber.java.Scenario;

public class Action_utilites extends TestContext {

	WebDriver driver;
	WebDriverWait wait;
	Scenario scn;
	Actions element;



	public Action_utilites(WebDriver driver,WebDriverWait wait, Scenario scn) {
		this.driver = driver;
		this.wait = wait;
		this.scn = scn;
		element = new Actions(this.driver);

	}

	/*
	 * moveToelement helps us to move the mouse cursor to a WebElement on the web page
	 */
	public void movetoelement(By Locator) {
		wait_util.waitForElementPresent(Locator);
		element.moveToElement(driver.findElement(Locator)).build().perform();	
	}

	/*
	 * click() method to help you perform various mouse-based operations for your web-application
	 */
	public void Click(By locator) {

		WebElement element = driver.findElement(locator);
		wait_util.waitForElementVisibilityOfElementLocated(locator);
		element.click();
	}

	/*
	 * SendKeys is a method that is used to send keyboard input such as characters, numbers, and symbols to text boxes inside an application.
	 */
	public void Dosendkeys(String text ,By Locator)
	{
		WebElement element = driver.findElement(Locator);
		element.sendKeys(text);
	}

	public void dropdown(String text ,By Locator)
	{
		Select element = new Select(driver.findElement(Locator));
		element.selectByVisibleText(text);
	}

	public void windowHandlle() 
	{
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> it=handle.iterator();
		String win1=it.next();
		String win2=it.next();
		driver.switchTo().window(win2);
	}

	/*
	 * Assert use Actual result is compared with expected result with the help of Assertion
	 */
	public void asserting(String erro_msg, String success_msg, String expected, String value) {
		Assert.assertEquals(erro_msg,expected,value);


		System.out.println(success_msg);
	}

	/*
	 * getText() method returns the innerText of an element.
	 */
	public String GetText(By locator)
	{
		String text=driver.findElement(locator).getText();
		return text;
	}

	/*
	 * The getAttribute() method fetches the text contained by an attribute in an html document
	 */
	public String getAttribute(By locator,String Src)
	{
		String attr=driver.findElement(locator).getAttribute(Src);
		return attr;
	}

}