import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider_excel {

	public static void main(String a[]) throws IOException
	{
		FileInputStream file= new FileInputStream("D://testing/login.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file); 
		Sheet sheet= workbook.getSheet("data");
		int count = sheet.getLastRowNum();
		for(int i=1;i<=count;i++)
		{
			Row r=sheet.getRow(i);
			Cell cell=r.getCell(0);
			String un=cell.getStringCellValue();
			Cell cell1=r.getCell(1);
			String p=cell1.getStringCellValue();
			System.out.println("Username"+un+"Password"+p+"\n");
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			  driver.get("https://opensource-demo.orangehrmlive.com/");
			  driver.manage().window().maximize();
			 
			  WebElement user_txt=driver.findElement(By.id("txtUsername"));
				WebElement pass_txt=driver.findElement(By.id("txtPassword"));
				WebElement login_btn=driver.findElement(By.id("btnLogin"));
				user_txt.sendKeys(un);
				pass_txt.sendKeys(p);
				login_btn.click();	
				
				String filename="D:\\SoftwareTestingMaterial.png"+i;
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(screenshotFile, new File(filename));
			    
			    
				driver.close();
			
		}
	}
}
