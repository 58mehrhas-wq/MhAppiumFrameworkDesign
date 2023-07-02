package org.mehrdad.utils;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class IOSActions extends AppiumUtils {
	
	IOSDriver driver;
	public IOSActions(IOSDriver driver)
	{
//		super(driver);
		this.driver = driver;
	}
	
	public void longPressAction(WebElement ele)
	{
		Map <String, Object>params = new HashMap<String, Object>();
		params.put("element", ((RemoteWebElement)ele).getId());
		params.put("duration", 5);
		
		driver.executeScript("mobile: touchAndHold", params );
	}
	
	public void scrollToEndAction()
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
	}
	
	public void scrollToWebElement(WebElement ele)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("direction", "down");
		params.put("element", ((RemoteWebElement)ele).getId());
		
		driver.executeScript("mobile:scroll", params);
	}
	
	public void swipeAction(WebElement ele, String direction )
	{
		Map<String, Object> params1 = new HashMap<String, Object>();
		params1.put("direction", "left");
		
		driver.executeScript("mobile:swipe", params1);
	}
	


}
