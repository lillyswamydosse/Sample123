package first;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {
	public static void main(String a[]) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement utxt=driver.findElement(By.id("txtUsername"));
		WebElement ptxt=driver.findElement(By.id("txtPassword"));
		utxt.sendKeys("Admin");
		ptxt.sendKeys("admin123");
		WebElement lbtn=driver.findElement(By.id("btnLogin"));
		lbtn.click();
		
	JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 Thread.sleep(3000);
	 WebElement lbtn1=driver.findElement(By.xpath("//*[@id=\"total\"]/table/tbody/tr/td[2]"));
	js.executeScript("arguments[0].scrollIntoView();", lbtn1);
		
	}

}
