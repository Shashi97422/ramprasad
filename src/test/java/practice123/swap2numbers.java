package practice123;

public class swap2numbers {
public static void main(String[] args) {
	int n1=10;
	int n2=20;
	
//	int temp;
//	temp=n1;   
//	n1=n2;
//	n2=temp;
//	System.out.println("n1==>"+n1    +"     n2==>"+n2);
	
	n1=n1+n2;
	n2=n1-n2;
	n1=n1-n2;
	
	System.out.println("n1==>"+n1    +"     n2==>"+n2);
	
	
}
}
