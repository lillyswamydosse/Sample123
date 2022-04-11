package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise7 {

	public static void main(String a[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url="https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave";
		driver.get(url);
	//login validation	
		WebElement user=driver.findElement(By.id("txtUsername"));
		WebElement pass=driver.findElement(By.id("txtPassword"));
		WebElement clic=driver.findElement(By.id("btnLogin"));
		user.sendKeys("Admin");
		pass.sendKeys("admin123");
		clic.click();
	//Leave-Apply Leave test cases	
		WebElement menu1=driver.findElement(By.id("menu_leave_viewLeaveModule"));
		WebElement menu2=driver.findElement(By.id("#menu_leave_assignLeave"));
		menu1.click();
		menu2.click();
		
	}
}
