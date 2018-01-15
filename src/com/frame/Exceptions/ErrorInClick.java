package com.frame.Exceptions;

public class ErrorInClick extends Exception
{
	 public ErrorInClick(String message)
	  {
	   // super(message);
		 System.out.println(message);
	  }
}
