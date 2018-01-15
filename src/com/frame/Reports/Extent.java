package com.frame.Reports;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Extent{	
public static WebDriver driver;
public static ExtentReports extent;
public static ExtentTest test;
static int i;
static
{ 
	i=1;
	Calendar cal =Calendar.getInstance();
	SimpleDateFormat date=new SimpleDateFormat("dd_mm_yyyy-hh_mm_ss");
	extent =new ExtentReports(System.getProperty("user.dir")+"\\ExtentReport\\extent"+date.format(cal.getTime()) +".html",false);
	extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent - config.xml"));
}
	public void getResult(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(LogStatus.PASS,result.getName()+" test case PASSED");
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(LogStatus.SKIP,result.getName()+" test case skipped and the reason is :"+ result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL,result.getName()+" test case FAILED ");
		}
	}
}