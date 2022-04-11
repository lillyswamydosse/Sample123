package Second_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {
	WebDriver driver;
  @Test(dataProvider="logindata",priority=1)
   public void admin_login(String u, String p) {
	  WebElement user_txt=driver.findElement(By.id("txtUsername"));
		WebElement pass_txt=driver.findElement(By.id("txtPassword"));
		WebElement login_btn=driver.findElement(By.id("btnLogin"));
		user_txt.sendKeys(u);
		pass_txt.sendKeys(p);
		login_btn.click();	  
  }
  @DataProvider(name="logindata")
  public Object[][] login_credit()
  {
	  Object[][] data=new Object[3][2];
	  data[0][0]="Admin";
	  data[0][1]="admin123";
	  data[1][0]="Admin";
	  data[1][1]="admin";
	  data[2][0]="Admin";
	  data[2][1]="admin23";
	  return data;
  }
  @BeforeTest
  public void beforeTest() 
  {
	   		  WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			  driver.get("https://opensource-demo.orangehrmlive.com/");
			  driver.manage().window().maximize();
  }

}
