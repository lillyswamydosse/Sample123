package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrm_admin {
	public static void main(String a[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String baseurl="https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
		driver.get(baseurl);
		WebElement user_txt=driver.findElement(By.id("txtUsername"));
		WebElement pass_txt=driver.findElement(By.id("txtPassword"));
		WebElement login_btn=driver.findElement(By.id("btnLogin"));
		user_txt.sendKeys("Admin");
		pass_txt.sendKeys("admin123");
		login_btn.click();
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

}
