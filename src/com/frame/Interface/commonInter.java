package com.frame.Interface;

public interface commonInter {
	boolean click(String locatorType, String value);
	boolean close();
	boolean sendkeys(String locatorType, String value, String text);
	boolean hover(String locatorType, String value);
	boolean explixit(String locatorType,String value);
}
