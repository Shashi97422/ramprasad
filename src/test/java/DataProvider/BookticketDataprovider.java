package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookticketDataprovider {
@Test(dataProvider = "booTicket")
public void bookticketTest(String src , String dst) {
	System.out.println("from    "+    src + " to    "+  dst);
	
}
@DataProvider
public Object[][] booTicket() {
	Object[][] obj=new Object[6][2];
	obj[0][0]="bengaluru";
	obj[0][1]="Mangaluru";
	
	obj[1][0]="bengaluru";
	obj[1][1]="mysore";
	
	obj[2][0]="bengaluru";
	obj[2][1]="mumbai";
	
	obj[3][0]="bengaluru";
	obj[3][1]="dekhi";
	
	obj[4][0]="bengaluru";
	obj[4][1]="ladakh";
	
	obj[5][0]="bengaluru";
	obj[5][1]="hydrabad";
	
	return obj;
	
}
}
