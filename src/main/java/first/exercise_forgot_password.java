package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise_forgot_password {
	public static void main(String a[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread t;
		//Verify Forgot Password
	    driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
		String w=driver.getCurrentUrl();
		String actual_url="https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode";
				if(actual_url.equals(w))
				{
					System.out.println("Test Passed");
				}
		
			//verify reset button enabled
				WebElement reset =driver.findElement(By.id("btnSearchValues"));
				if(reset.isEnabled())
				{
					System.out.println("Test Passed");
				} 
				
		// Verify reset is working
				
		WebElement txt=driver.findElement(By.xpath("//*[@id=\"securityAuthentication_userName\"]"));
		txt.sendKeys("Admin");
		reset.click();
		
		//verify cancel button is working
		
		String cancel_url="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		WebElement cancel_btn=driver.findElement(By.xpath("//*[@id=\"btnCancel\"]"));
		cancel_btn.click();
		String cancelurl=driver.getCurrentUrl();
		if(cancel_url.equals(cancelurl))
		{
			System.out.println("Test Passed");
		}
		
	}

}
