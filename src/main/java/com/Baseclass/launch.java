package com.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch {
	WebDriver driver;
	public WebDriver app_launch(String url, String dvr)
	{
		if(dvr.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			return driver;
		}
		else if (dvr.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			return driver;
		}
		else if(dvr.equals("IE"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new InternetExplorerDriver();
			driver.get(url);
			driver.manage().window().maximize();
			return driver;
		}
		return driver;
		}
	
	public void quit()
	{
		this.driver.close();
		
	}
}
