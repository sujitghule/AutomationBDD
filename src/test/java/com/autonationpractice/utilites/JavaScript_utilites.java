package com.autonationpractice.utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.Scenario;

public class JavaScript_utilites {
	

		
		WebDriver driver;
		 WebDriverWait wait;
		Actions element;
		wait_utilites wait_util;
		JavaScript_utilites javaScript_util;
		
		public JavaScript_utilites(WebDriver driver, WebDriverWait wait) {
			this.driver = driver;
			this.wait = wait;
			
			
		}

		
		public void scrollIntoView_ByLocator(By locator) {
			WebElement element = driver.findElement(locator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}

	
		public void scrollIntoView(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}

	
		public void flash(WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			String bgcolor = element.getCssValue("backgroundColor");
			for (int i = 0; i < 10; i++) {
				changeColor("rgb(0,200,0)", element);
				changeColor(bgcolor, element);
			}
		}

		
		private void changeColor(String color, WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		
		public void drawBorder_ByElement(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='3px solid red'", element);
		}

		public void drawBorder_Bylocator(By locator) {
			WebElement element = driver.findElement(locator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='3px solid red'", element);
		}
		
	
		public void scrollPageDown() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}

		
		public void scrollPageUp() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		}

	}



