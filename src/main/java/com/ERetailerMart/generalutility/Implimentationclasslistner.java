package com.ERetailerMart.generalutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Implimentationclasslistner implements ITestListener {
    WebDriver driver;
	public void onTestfailure(ITestResult result) throws IOException {
		String methodname = result.getMethod().getMethodName();
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sDriver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshotss/"+methodname+".png");
		FileUtils.copyFile(src, dst);
	}
}
