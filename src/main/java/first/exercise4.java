package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise4 {
	public static void main(String a[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url="http://www.mercury-tours.com/";
		String actual_title="mercury-tours";
		driver.get(url);
		String title=driver.getTitle();		
		if(actual_title.equals(title))
		{
			System.out.println(title);
		}
		
		else
		{
			System.out.println("Title mismatch");
		}
		driver.close();
		
	}

}
