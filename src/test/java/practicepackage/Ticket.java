package practicepackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ticket {
@Test(dataProvider = "booktickets")
public void dataprovidertest(String src, int no) {
	System.out.println("Username==> "+src+"& password==> "+no);
}
@DataProvider
public Object[][] booktickets() {
	Object[][] objarr=new Object[5][2];
	
	objarr[0][0]="shashi";
	objarr[0][1]=12345;
	//objarr[0][2]=10;
	
	objarr[1][0]="manja";
	objarr[1][1]=1234;
	//objarr[1][2]=20;
	
	objarr[2][0]="supri";
	objarr[2][1]=4321;
	//objarr[2][2]=30;
	
	objarr[3][0]="susma";
	objarr[3][1]=9876;
	//objarr[3][2]=40;
	
	objarr[4][0]="venki";
	objarr[4][1]=9876;
	//objarr[4][2]=50;
	
	return objarr;
}
}
