package com.frame.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers
{
	String webPath = System.getProperty("user.dir") + "\\src\\com\\Resources\\";
	WebDriver driver;
	public WebDriver browsers(String w) 
	{
		if(w.equals("1") || w.equalsIgnoreCase("Chrome") || w.equalsIgnoreCase("Google Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", webPath + "chromedriver.exe"); 
			driver = new ChromeDriver();
		}
		else if(w.equals("2") || w.equalsIgnoreCase("IE") || w.equalsIgnoreCase("Internet Explorer")) 
		{
			System.setProperty("webdriver.ie.driver", webPath + "iedriver.exe");
			driver = new InternetExplorerDriver(); 	
		}
		else if(w.equals("3") || w.equalsIgnoreCase("Firefox") || w.equalsIgnoreCase("Mozilla Firefox")) 
		{
			System.setProperty("webdriver.firefox.bin" , "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			System.setProperty("webdriver.gecko.driver",webPath + "geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			browsers(w);
		}			
		return driver;
	}
}
