package com.frame.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import com.frame.Exceptions.ErrorInClick;
import com.frame.Exceptions.ErrorInHovering;
import com.frame.Exceptions.ErrorInSending;
import com.frame.Exceptions.ErrorInWaiting;
import com.frame.Impl.commonImpl;
import com.frame.Utils.Assertions;
import com.frame.Utils.ExcelUtils;

public class HelperElements
{

	public void operation(int start,int end, int DataRow, int count, commonImpl ci, ExcelUtils exu, Assertions asert) throws ErrorInSending, ErrorInClick, ErrorInHovering, ErrorInWaiting, AWTException 
	{	

		for (int i = start; i <= end; i++) 
		{
			String s = exu.getCellData(0, 2, i);
			System.out.println(s);
			if (s.equalsIgnoreCase("sendkeys")) 
			{
				try {
					boolean ch = ci.sendkeys(exu.getCellData(0, 0, i), exu.getCellData(0, 1, i),
							exu.getCellData(1, count, DataRow));
					DataRow++;
					asert.asert(ch, s);
				} 
				catch (NoSuchElementException ne) 
				{
					System.out.println("Element not Found");
					Assert.assertFalse(true);
				}
			}
			else if (s.equalsIgnoreCase("click")) 
			{
				try 
				{
					asert.asert(ci.click(exu.getCellData(0, 0, i), exu.getCellData(0, 1, i)), s);
				}
				catch (NoSuchElementException ne) 
				{
					System.out.println("Element not Found");
					Assert.assertFalse(true);
				}
			} 
			else if (s.equalsIgnoreCase("hover")) 
			{
				try 
				{
					asert.asert(ci.hover(exu.getCellData(0, 0, i), exu.getCellData(0, 1, i)), s);
				}
				catch (NoSuchElementException ne) 
				{
					System.out.println("Element not found");
					Assert.assertFalse(true);
				}
			}
			else if (s.equalsIgnoreCase("alertok")) 
			{
				try 
				{
					Thread.sleep(3000);
					Robot r = new Robot();
					r.keyPress(KeyEvent.VK_ENTER);
				}
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
}