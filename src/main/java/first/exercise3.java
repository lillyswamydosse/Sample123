package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise3 {
	public static void main(String a[])
	{
		WebDriverManager.iedriver().setup();
		WebDriver driver=new InternetExplorerDriver();  
		driver.get("http://www.google.com/");
	}

}


 
