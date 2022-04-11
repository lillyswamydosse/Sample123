package Second_testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.TakesScreenshot;

public class orangesrm_login  {
	 
	 WebDriver driver;
	
  @Test(priority=1)
  public void admin_login() {
	  WebElement user_txt=driver.findElement(By.id("txtUsername"));
		WebElement pass_txt=driver.findElement(By.id("txtPassword"));
		WebElement login_btn=driver.findElement(By.id("btnLogin"));
		user_txt.sendKeys("Admin");
		pass_txt.sendKeys("admin123");
		login_btn.click();	  
  }
  @Test(priority=2)
  public void admin_menu()
  {
	  driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]")).click();
		
		WebElement admin_user = driver.findElement(By.id("searchSystemUser_userName"));
		admin_user.sendKeys("Lilly");
		WebElement emp_user = driver.findElement(By.xpath("//*[@id=\"searchSystemUser_employeeName_empName\"]"));
		emp_user.sendKeys("Orange");
		
		Select s1= new Select(driver.findElement(By.id("searchSystemUser_userType")));
		s1.selectByValue("1");
		Select s2 = new Select(driver.findElement(By.id("searchSystemUser_status")));
		s2.selectByValue("1");
		WebElement bt1=driver.findElement(By.id("btnAdd"));
		bt1.click();
		
  }
  @Test(priority=3)
  public void admin_job()
  {
	  
	  driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]")).click();
	   driver.findElement(By.id("menu_admin_Job")).click();
	   
	   driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
	   driver.findElement(By.id("btnAdd")).click();
	   driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("QA");
	   driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("Tester");
	  WebElement upload=driver.findElement(By.id("jobTitle_jobSpec"));
	 upload.sendKeys("D:\\abc.txt");
	 Assert.assertEquals(upload.isDisplayed(), true);
	// upload.click();
	 driver.findElement(By.id("btnSave")).click();
	  
  }
  
  
	  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
 
	  
  

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() 
  {
	   		  WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			  driver.get("https://opensource-demo.orangehrmlive.com/");
			  driver.manage().window().maximize();
  }

  @AfterTest
  public void output_screen() throws IOException  {
	  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
	// driver.close();
  }

  @BeforeSuite
  public void beforeSuite() {
	 
  }

  @AfterSuite
  public void afterSuite() {
  }

}
