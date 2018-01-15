package com.frame.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
	public String property(String value) throws IOException {
		FileInputStream fileInput = new FileInputStream(new File(System.getProperty("user.dir")+"//global.properties"));
		Properties prop = new Properties();
		prop.load(fileInput);
		return (prop.getProperty(value));

	}
}
