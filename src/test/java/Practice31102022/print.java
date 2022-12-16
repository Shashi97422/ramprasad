package Practice31102022;

public class print {
public static void main(String[] args) {
	int n1=8 , n2=3, n3=4, largest=0;
	if(n1>n2 && n1>n3) {
		 largest = n1;
	}
	if(n2>n1 && n2>n3) {
		 largest = n2;
	}
	if(n3>n1 && n3>n2) {
		 largest = n3;
	}
	System.out.println(largest);
}
}
