package com.frame.Reports;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {
public Logger logger;
	public  Log4j()
	{
		logger = Logger.getLogger("Log4j");
		PropertyConfigurator.configure("Log4j.properties");
	}
	/*	WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1043163\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		logger.info("Username Entered");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		logger.info("Password Entered ");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		logger.fatal("Login Successful");
	*/	}
	