package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag {
	public static void main(String a[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver ();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag1= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop1= driver.findElement(By.id("droppable"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(drag1, drop1).build().perform();
}}

