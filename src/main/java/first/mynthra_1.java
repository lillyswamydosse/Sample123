package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mynthra_1 {
	public static void main(String a[]) throws InterruptedException
	{
		Thread t;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/?utm_source=cashkaro&utm_medium=Affiliates&utm_campaign=45629509");
		WebElement menu1=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a"));
		
		WebElement menu2=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/div/div/div/li[1]/ul/li[2]/a"));
		
		Actions action = new Actions(driver);
		 action.moveToElement(menu1).perform();
		 action.moveToElement(menu2).click().perform();
		 
		 Thread.sleep(3000);
		 
		 WebElement cat1=driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label/span"));
		 cat1.click();
		 
	}

}
