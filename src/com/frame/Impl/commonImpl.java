package com.frame.Impl;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.frame.Interface.commonInter;
import com.frame.Locators.locators;

public class commonImpl implements commonInter 
{
	public WebDriver driver;
	Actions action;
	public commonImpl(WebDriver driver) {
		this.driver=driver;
		action=new Actions(driver);  
	}
	public WebElement element ;
	public WebDriverWait wait ;
	
	@Override
	public boolean sendkeys(String locatorType, String value, String text) 
	{
		By loc=null;
		try {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(locators.locatorValue(locatorType, value)));}
		catch(TimeoutException te) {System.out.println("Timeout");}
		loc = locators.locatorValue(locatorType, value);
		element = driver.findElement(loc);
		element.sendKeys(text);
		return true;
		
		
	}
	@Override
	public boolean click(String locatorType, String value)
	{
		By loc;
		try {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(locators.locatorValue(locatorType, value)));
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(locators.locatorValue(locatorType, value)));}
		catch(TimeoutException te) {System.out.println("Timeout");}
		loc = locators.locatorValue(locatorType, value);
		element = driver.findElement(loc);
		element.click();
		return true;
	}
	@Override
	public boolean close() 
	{
		driver.close();
		return true;
	}
	@Override
	public boolean hover(String locatorType, String value) {
		By loc;
		loc = locators.locatorValue(locatorType, value);
		element = driver.findElement(loc);
		action.moveToElement(element).build().perform();
		return true;	
	}
	@Override
	public boolean explixit(String locatorType,String value){
		// TODO Auto-generated method stub
		By loc;
		loc = locators.locatorValue(locatorType, value);
		element = driver.findElement(loc);
		try {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));}
		catch(TimeoutException te) {System.out.println("Timeout");}
		return true;
	}
	
}