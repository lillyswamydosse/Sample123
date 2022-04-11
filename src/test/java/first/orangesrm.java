package first;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.internal.runners.statements.ExpectException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.TakesScreenshot;


public class orangesrm  
{
	 	  WebDriver driver;
	 	  			
		  	 	
  @Test
  public void admin_login() throws Exception {
	  
	  
	  WebElement user_txt=driver.findElement(By.id("txtUsername"));
		WebElement pass_txt=driver.findElement(By.id("txtPassword"));
		WebElement login_btn=driver.findElement(By.id("btnLogin"));
		user_txt.sendKeys("Admin");
		pass_txt.sendKeys("admin123");
		login_btn.click();	 
			   }
  @Test
  public void admin_menu() throws Exception 
  {
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
       driver= new ChromeDriver (); 
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	       
	 
	  
  }

  @AfterTest
  public void afterTest() throws IOException  {
	  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
	    driver.close();
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	 
  }

  @AfterSuite
  public void afterSuite() {
  }

}
