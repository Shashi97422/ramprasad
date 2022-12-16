package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ERetailerMart.generalutility.ExcelUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatadrivenForFBLogin {
	@Test(dataProvider = "sendData")
	public void login(String username,String password) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(username);
	    driver.findElement(By.name("pass")).sendKeys(password);
	    //driver.findElement(By.id("loginbutton")).click();
	   // Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
	@DataProvider
	public Object[][] sendData() throws Throwable {
		Object[][] arr=new Object[5][2];
		ExcelUtility elib=new ExcelUtility();
		System.out.println(elib.getRowCount("Sheet1"));
		for (int i = 1; i < elib.getRowCount("Sheet1"); i++) {
			arr[i][0]=elib.getExcelData("Sheet1", i, 0);
		}
		for (int j = 1; j < elib.getRowCount("Sheet1"); j++) {
			arr[j][1]=elib.getExcelData("Sheet1", j, 1);
			
		}
		return arr;

	}
}