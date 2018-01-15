package com.frame.Test;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import com.frame.Base.Browsers;
import com.frame.Impl.commonImpl;
import com.frame.Locators.locators;
import com.frame.Reports.Extent;
import com.frame.Utils.*;
public class HelperTest extends Extent 
{
	PropertyUtils p;
	Browsers b;
	String url;
	protected ExcelUtils exu;
	locators locator;
	int val;
	protected commonImpl ci;
	@BeforeSuite
	public void beforeSuite() throws Exception 
	{
		p=new PropertyUtils(); 
		b=new Browsers();
		exu=new ExcelUtils();	
	}
	@BeforeMethod
	public void beforeMethod(Method result)throws Exception 
	{
		url=p.property("url");
		String br=p.property("browser");
		driver=b.browsers(br);
		test=extent.startTest(result.getName());
		test.log(LogStatus.INFO,result.getName()+" test started");
		ci=new commonImpl(driver);
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception
	{
		getResult(result);
		if(ITestResult.FAILURE==result.getStatus())
		{
			String path=ScreenShot.takeScreenShot(driver);
			test.log(LogStatus.FAIL,test.addScreenCapture(path));	  		  
		}
		else if(ITestResult.SUCCESS==result.getStatus())
		{
			String path=ScreenShot.takeScreenShot(driver);
			test.log(LogStatus.PASS,test.addScreenCapture(path));
			test.log(LogStatus.PASS,"TestCase Passed");	  		  
		}	
		driver.close();
	}

	@BeforeClass
	public void beforeClass() {

	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}



	@AfterSuite
	public void afterSuite() 
	{
		extent.flush();
	}

}
