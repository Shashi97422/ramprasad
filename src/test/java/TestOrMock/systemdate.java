package TestOrMock;

import java.util.Date;

public class systemdate {
public static void main(String[] args) {
	Date d= new Date();
	System.out.println(d);
	
	String currentdate = d.toString();
	String[] arr = currentdate.split(" ");
	String yyyy = arr[5];
	String dd = arr[2];
	int mm = d.getMonth()+1;
	String formate = yyyy+"-"+mm+"-"+dd;
	System.out.println(formate);
	
}
}
