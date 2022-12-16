package DataProvider;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ERetailerMart.generalutility.BaseClass;
import com.ERetailerMart.generalutility.ExcelUtility;

public class GetData extends BaseClass {
	@Test(dataProvider = "takeData")
	public void launchbrowser(String username, String password) throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(username);
	    driver.findElement(By.name("pass")).sendKeys(password);
	    //driver.findElement(By.id("loginbutton")).click();
	   // Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
	@DataProvider
	public Object[][] takeData() throws Throwable{
		Object[][] arr=new Object[5][2];
		ExcelUtility elib=new ExcelUtility();
		System.out.println(elib.getRowCount("Sheet1"));
		System.out.println(elib.getRowCount("Sheet1"));
		for(int i=0;i<elib.getRowCount("Sheet1")-1;i++) {
			arr[i][0]=elib.getExcelData("Sheet1", i, 0);
		}
		for(int j=0;j<elib.getRowCount("Sheet1")-1;j++) {
			arr[j][1]=elib.getExcelData("Sheet1", j, 1);
		
		}
		return arr;
		
	}
	}

