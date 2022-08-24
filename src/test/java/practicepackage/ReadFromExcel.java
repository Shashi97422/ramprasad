package practicepackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ERetailerMart.generalutility.ExcelUtility;

public class ReadFromExcel{
	@Test(dataProvider = "sentData")
	public void read(String UserName, String Password) {
System.out.println("UserName==> "+UserName+" & Password==> "+Password);

	}
	@DataProvider
	public Object[][] sentData() throws Throwable {
		Object[][] arr=new Object[5][2];
		ExcelUtility elib=new ExcelUtility();
		int s = elib.getRowCount("Sheet1");
		System.out.println(s);
		for(int i=0;i<elib.getRowCount("Sheet1")-2;i++) {
			arr[i][0]=elib.getExcelData("Sheet1", i+1, 0);
			
		}
		for(int j=0;j<elib.getRowCount("Sheet1")-2;j++) {
			arr[j][1]=elib.getExcelData("Sheet1", j+1, 1);
		}return arr;
	}
}
