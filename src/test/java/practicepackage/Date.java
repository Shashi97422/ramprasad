package practicepackage;

public class Date {
public static void main(String[] args) {
	java.util.Date d=new java.util.Date();
	System.out.println(d);
	String currentDate = d.toString();
	System.out.println(currentDate);
	String[] arr=currentDate.split(" ");
String yyyy = arr[5];
String dd = arr[2];
int mon = d.getMonth()+1;
System.out.println(mon);
System.out.println(dd);
String formate = yyyy+"-"+mon+"-"+dd;
System.out.println(formate);
}
}
