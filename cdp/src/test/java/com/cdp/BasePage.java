package com.cdp;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.css.sac.Locator;



public class BasePage {
	protected WebDriver driver;
	protected String[][] locatorMap;



	protected void type(Locator locator, String values) throws Exception {
	//	WebElement e = findElement(driver, locator);
	//	e.sendKeys(values);
	}

	protected void click(Locator locator) throws Exception {
		//WebElement e = findElement(driver, locator);
		//e.click();
	}

}