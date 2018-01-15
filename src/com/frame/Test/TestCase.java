package com.frame.Test;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;
import com.frame.Base.HelperElements;
import com.frame.Exceptions.ErrorInClick;
import com.frame.Exceptions.ErrorInHovering;
import com.frame.Exceptions.ErrorInSending;
import com.frame.Exceptions.ErrorInWaiting;
import com.frame.Utils.Assertions;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase extends HelperTest 
{
	HelperElements h=new HelperElements();
	static int Signup=0;
	static int Login=0;
	static int Book=0;
	@Test(invocationCount=2 , priority=1,enabled=false)
	public void SignUp() throws ErrorInSending, ErrorInClick, ErrorInHovering, ErrorInWaiting, AWTException, NumberFormatException, IOException 
	{
		Assertions asert = new Assertions();
		int ExcelrowStart=Integer.parseInt(p.property("SignUpStart"));
		int ExcelrowEnd=Integer.parseInt(p.property("SignUpEnd"));;
		int DataRow=Integer.parseInt(p.property("DataForSignup"));
		++Signup;
		h.operation(ExcelrowStart, ExcelrowEnd,DataRow,Signup,ci,exu,asert);
		
	}
	@Test(invocationCount=2, priority=2)
	public void Login() throws AWTException, ErrorInSending, ErrorInClick, ErrorInHovering, ErrorInWaiting, NumberFormatException, IOException 
	{
		Assertions asert = new Assertions();
		int ExcelrowStart=Integer.parseInt(p.property("LoginStart"));
		int ExcelrowEnd=Integer.parseInt(p.property("LoginEnd"));
		int DataRow=Integer.parseInt(p.property("DataForLogin"));
		++Login;
		h.operation(ExcelrowStart, ExcelrowEnd,DataRow,Login,ci,exu,asert);		
	}
	@Test(invocationCount=2, priority=3 , enabled=false)
	public void BookaConsultant() throws AWTException, ErrorInSending, ErrorInClick, ErrorInHovering, ErrorInWaiting, NumberFormatException, IOException 
	{
		Assertions asert = new Assertions();
		int ExcelrowStart=Integer.parseInt(p.property("BACStart"));
		int ExcelrowEnd=Integer.parseInt(p.property("BACEnd"));
		int DataRow=Integer.parseInt(p.property("DataForBAC"));
		++Book;
		h.operation(ExcelrowStart, ExcelrowEnd,DataRow,Book,ci,exu,asert);
		
	}
	
	
}
