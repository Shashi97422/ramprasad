package practicepackage;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ERetailerMart.generalutility.BaseClass;
import com.ERetailerMart.generalutility.ExcelUtility;

public class Practic extends BaseClass {
	@DataProvider
	public String data() throws Throwable {
		ExcelUtility elib=new ExcelUtility();
		Object[][]arr=new Object[6][2];
		for(int i=0;i<7;i++) {
			for(int j=0; j<2;j++) {
				arr[i][j]=elib.getExcelData("Sheet1", 1, 0);
			}
		}
		return data();
		
		
	}
@Test
public void launchbrowser(String username, String password) throws InterruptedException {
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("pass")).sendKeys(password);
	driver.navigate().refresh();
	Thread.sleep(2000);
	
}
}
