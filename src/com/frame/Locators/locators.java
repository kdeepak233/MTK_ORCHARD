package com.frame.Locators;

import org.openqa.selenium.By;

public class locators{
	public static By locatorValue(String locatorType, String value)
	{
		By by=null;
		String s=locatorType.toLowerCase();
		
			switch (s) 
			{
		case "id":
			by = By.id(value);
			break;
		case "name":
			by = By.name(value);
			break;
		case "xpath":
			by = By.xpath(value);
			break;
		case "cssselector":
			by = By.cssSelector(value);
			break;
		case "linkText":
			by = By.linkText(value);
			break;
		case "partialLinkText":
			by = By.partialLinkText(value);
			break;
		default:
			by = null;
			break;
		}
		
		return by;
	}
}