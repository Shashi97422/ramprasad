package tyDrivepracticepkg;

public class PrintABCD {
	public static void main(String[] args) {
		String a="amma"; 
		String b="appa"; 
		
		a=a+b;  //ammaappa
		b=a.substring(0,a.length()-b.length());  //amma
		a=a.substring(4,a.length());             //appa
		
		System.out.println("after swap a ==>>"+a);
		System.out.println("after swap a ==>>"+b);
		
	}
}

