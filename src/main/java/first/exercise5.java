package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise5 {
	public static void main(String ar[])
{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver ();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement user=driver.findElement(By.id("txtUsername"));
				WebElement pass=driver.findElement(By.id("txtPassword"));
		WebElement clic=driver.findElement(By.id("btnLogin"));
		
		user.sendKeys("Admin");
		pass.sendKeys("admin123");
		clic.click();
		driver.close();
		}

}
