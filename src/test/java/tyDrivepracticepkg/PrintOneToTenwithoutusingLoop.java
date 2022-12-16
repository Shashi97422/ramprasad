package tyDrivepracticepkg;

public class PrintOneToTenwithoutusingLoop {
public static int add(int n) {
	if(n<=10) {
		System.out.println(n);
		add(n+1);
		
	}
	return n;
	
}
public static void main(String[] args) {
	add(1);
}
}
