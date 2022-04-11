package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class menu_orangehrm {
	public static void main(String a[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement uname=driver.findElement(By.id("txtUsername"));
		WebElement pword=driver.findElement(By.id("txtPassword"));
		WebElement lbtn=driver.findElement(By.id("btnLogin"));
		
		uname.sendKeys("Admin");
		pword.sendKeys("admin123");
		lbtn.click();
	}
}
