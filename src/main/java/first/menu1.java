package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class menu1 {
	public static void main(String a[]) throws Exception
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
		WebElement admin = driver.findElement((By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")));
		WebElement user = driver.findElement((By.xpath("//*[@id=\"menu_admin_UserManagement\"]")));
		WebElement usr = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(admin).perform();
		act.moveToElement(user).perform();
		act.moveToElement(usr).click().perform();
		Thread.sleep(3000);
		
		WebElement txt1=driver.findElement(By.id("searchSystemUser_userName"));
		WebElement drop1=driver.findElement(By.id("searchSystemUser_userType"));
		WebElement txt2=driver.findElement(By.id("searchSystemUser_employeeName_empName"));
		WebElement drop2=driver.findElement(By.id("searchSystemUser_status"));
		
		txt1.sendKeys("Lilly");
		txt2.sendKeys("Lilly");
		
		Select slt= new Select(drop1);
		slt.selectByValue("1");
		Select slt1 = new Select(drop2);
		slt1.selectByValue("0");
		
		WebElement lbt1 = driver.findElement(By.id("btnAdd"));
		lbt1.click();
		Thread.sleep(3000);
		
		WebElement name=driver.findElement(By.id("systemUser_userType")); 
		WebElement name1=driver.findElement(By.id("systemUser_employeeName_empName"));
		
		
	}

}
