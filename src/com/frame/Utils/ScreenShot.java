package com.frame.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	

		@SuppressWarnings("resource")
		public static String takeScreenShot(WebDriver driver) {
		    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    String encodedBase64 = null;
		    FileInputStream fileInputStreamReader = null;
		    try {
		        fileInputStreamReader = new FileInputStream(scrFile);
		        byte[] bytes = new byte[(int)scrFile.length()];
		        fileInputStreamReader.read(bytes);
		        encodedBase64 = new String(Base64.getEncoder().encode(bytes));
		    } catch (FileNotFoundException e) {
		        e.printStackTrace();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		    System.out.println("ScreenShotDone");
		    return "data:image/png;base64,"+encodedBase64;
		    
		}

	

}
