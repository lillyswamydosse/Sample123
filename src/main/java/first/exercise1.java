package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise1 {
	public static void main(String a[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver ();
		driver.get("https://demoqa.com/browser-windows/");
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
