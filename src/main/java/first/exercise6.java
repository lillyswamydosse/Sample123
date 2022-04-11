package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class exercise6 {
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
			String actual_url=driver.getCurrentUrl();
			String expected_url="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
			if(actual_url.equals(expected_url))
					{
				System.out.println("Test Passed");
					}
			driver.close();
			}

}
