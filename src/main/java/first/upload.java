package first;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class upload {
public static void main(String a[])
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/upload/");
	driver.manage().window().maximize();
	WebElement upload=driver.findElement(By.id("uploadfile_0"));
	WebElement upload_check=driver.findElement(By.id("terms"));
	WebElement upload_btn=driver.findElement(By.id("submitbutton"));
	upload.sendKeys("d:\\abc.txt");
	Assert.assertEquals(upload.isDisplayed(), true);
	upload_check.click();
	upload_btn.click();
}

}
