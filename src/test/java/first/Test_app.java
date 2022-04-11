package first;

import org.testng.annotations.Test;

import com.Baseclass.launch;
import com.Selenium_resuable.resuable_code;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test_app {
	static WebDriver driver;
	launch l= new launch();
	 static resuable_code r = new resuable_code();
  @Test(dataProvider="login_data",priority=1)
  public static void orang_login(String u, String p) throws IOException {
	 
	  WebElement user_txt=driver.findElement(By.id("txtUsername"));
		WebElement pass_txt=driver.findElement(By.id("txtPassword"));
		WebElement login_btn=driver.findElement(By.id("btnLogin"));
	  resuable_code.login(driver, user_txt,pass_txt,login_btn, u,p);
  }
  @DataProvider(name="login_data")
  public Object[][] login_user()
  {
	  Object[][] data = new Object[3][2];
	 data[0][0]="Admin";
	 data[0][1]="admin123";
	data[1][0]="admi";
	 data[1][1]="admin";
	 data[2][0]="add";
	 data[2][1]="admin";
	  return data;
  }
  @Test
  public static void orange_admin() throws IOException
  {
	  String admin_menu="//*[@id=\"menu_dashboard_index\"]/b";
	 String file_loc="D:\\screens\\dashboard.png";
	  resuable_code.click_element_xpath(driver,admin_menu);
	  resuable_code.screenshot(driver,file_loc);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	  l.quit();
  }

  @BeforeClass
  public void beforeClass() {
	 driver= l.app_launch("https://opensource-demo.orangehrmlive.com/", "chrome");
	  
  }

  @AfterClass
  public void afterClass() {
	 
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
