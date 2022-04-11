package first;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
public class screen {
	
	
	public static void main(String a[])throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement utxt=driver.findElement(By.id("txtUsername"));
		WebElement ptxt=driver.findElement(By.id("txtPassword"));
		utxt.sendKeys("Admin");
		ptxt.sendKeys("admin23");
		WebElement lbtn=driver.findElement(By.id("btnLogin"));
		lbtn.click();
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
		
}
}
