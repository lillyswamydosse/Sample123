package com.Selenium_resuable;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Baseclass.launch;

public class resuable_code {
	
public static void login(WebDriver driver,WebElement uname,WebElement pword, WebElement btn, String u,String p) throws IOException
	{  int i=1;
		uname.sendKeys(u);
		pword.sendKeys(p);
		btn.click();
		String file_loc="D:\\screens\\login"+i+".png";
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotFile, new File(file_loc));
	   
	}

	public static void send_keys(WebDriver driver, String id_ele, String value)
	{
	driver.findElement(By.id(id_ele)).sendKeys(value);
	}

public static void click_element_id(WebDriver driver, String id_ele)
{
	driver.findElement(By.id(id_ele)).click();
}

public static void click_element_xpath(WebDriver driver, String id_ele)
{
	driver.findElement(By.xpath(id_ele)).click();
}
	
public static void click_link(WebDriver driver, String id_ele)
{
	driver.findElement(By.linkText(id_ele)).click();
}

public static String get_text_id(WebDriver driver, String id_ele)
{
	return driver.findElement(By.linkText(id_ele)).getText();
}

public static String get_text_xpath(WebDriver driver, String id_ele)
{
	return driver.findElement(By.xpath(id_ele)).getText();
}

public static String verify_text(WebDriver driver, String ele,String text1)
{
	String t= driver.findElement(By.id(ele)).getText();
	if(text1.equals(t))
	
		return "Pass";
	
	else
		return "Fail";
}

public void dropdown(WebDriver wd, String ele, String value)
{
	Select sl= new Select(wd.findElement(By.id(ele)));
	sl.selectByValue(value);
}

public void radio_button(WebDriver wd, String ele)
	{
		wd.findElement(By.id(ele)).click();
		
	}

public static void check_box(WebDriver wd, String ele)
	{
		wd.findElement(By.id(ele)).click();
	}
	
public static void drag_drop(WebDriver wd, WebElement ele1,WebElement ele2, String frm)
	{
	wd.switchTo().frame(wd.findElement(By.className(frm)));
	Actions act = new Actions(wd);
	act.dragAndDrop(ele1, ele2).build().perform();
	}
	public void file_upload(WebDriver wd, WebElement click_btn, String ele1, String file_loc)
	{
		wd.findElement(By.id(ele1)).sendKeys(file_loc);
		click_btn.click();
	}
	
	public void scroll_bar(WebDriver wd, String s_loc) throws InterruptedException, IOException
	{
		JavascriptExecutor js=(JavascriptExecutor) wd;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(3000);
		 WebElement lbtn1=wd.findElement(By.xpath(s_loc));
		js.executeScript("arguments[0].scrollIntoView();", lbtn1);
		File screenshotFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotFile, new File("D:\\screens\\scroll.png"));
	}
	public static void screenshot(WebDriver wd, String loc) throws IOException
	{
		File screenshotFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotFile, new File(loc));
	}
}
