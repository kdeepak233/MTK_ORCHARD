package com.frame.Base;

import java.io.IOException;

import com.frame.Utils.PropertyUtils;

public class Propertyfilevalues {
	PropertyUtils p=new PropertyUtils();
	String url;
	String browser;
	int value;
	public Propertyfilevalues() throws IOException {
		url=p.property("url");
		value=Integer.parseInt(p.property("value"));
		browser=p.property("browser");
	}
	
	
}
