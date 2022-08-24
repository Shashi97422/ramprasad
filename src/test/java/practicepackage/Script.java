package practicepackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script extends com.ERetailerMart.generalutility.DataProvider {
	@DataProvider
	public Object[][] getloginData() throws EncryptedDocumentException, IOException {
	Object[][] data=com.ERetailerMart.generalutility.DataProvider.getTest();
	return data;
	}
	
@Test(dataProvider = "getloginData")
public void login(String username , String passwprd) throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("pass")).sendKeys(passwprd);
	driver.navigate().refresh();
	Thread.sleep(3000);
	
}
}
