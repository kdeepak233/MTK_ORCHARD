package com.frame.Utils;

import org.testng.Assert;

import com.frame.Exceptions.ErrorInClick;
import com.frame.Exceptions.ErrorInHovering;
import com.frame.Exceptions.ErrorInSending;
import com.frame.Exceptions.ErrorInWaiting;

public class Assertions
{

	public void asert(boolean check, String s) throws ErrorInSending, ErrorInClick, ErrorInHovering, ErrorInWaiting {		try 
		{
			Assert.assertTrue(check);
			System.out.println("done");
		}
		catch(AssertionError e)
		{
			System.out.println("Assertion False");
			Assert.assertFalse(true);
		}
	}
}
