package practicepackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookTicket {
@Test(dataProvider = "dataprovider_bookticketTest")
public void BookTicketTest(String src , String dst) {
	System.out.println("Book ticket from "+src+" to "+dst);
}
@DataProvider
public Object[][] dataprovider_bookticketTest(){
	Object[][] objarr=new Object[5][2];
	objarr[0][0]="Bengaluru";
	objarr[0][1]="Goa";
	
	objarr[1][0]="Bengaluru";
	objarr[1][1]="Mysore";
	
	objarr[2][0]="Bengaluru";
	objarr[2][1]="Mangalore";
	
	objarr[3][0]="Bengaluru";
	objarr[3][1]="Hydrabad";
	
	objarr[4][0]="Bengaluru";
	objarr[4][1]="MP";
	return objarr;
	
}
}
