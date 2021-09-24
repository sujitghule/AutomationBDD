package com.autonationpractice.utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_utilites {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	public wait_utilites(WebDriver driver, WebDriverWait wait)
	{
		
		this.driver= driver;
		this.wait= wait;
		
	}
	
	
	public void waitForElementClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	
	public void waitForElementVisibilityOfElementLocated(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public void waitForElementPresent(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
