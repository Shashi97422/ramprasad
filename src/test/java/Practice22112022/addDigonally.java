package Practice22112022;

import java.util.Iterator;

public class addDigonally {
public static void main(String[] args) {
	int [][] s= {{1,2,3},
			     {4,5,6},
			     {7,4,9}};
	int sum=0;
	for (int i = 0; i < s.length; i++) {
		sum=sum+s[i][i];
	}
	System.out.println(sum);
	
	int sum1=0;
	int n=2;
	for (int i = 0; i < s.length; i++) {
		sum1=sum1+s[i][n];
		n--;
	}
	System.out.println(sum1);
	
	int sum2 = 0;
	int n1=1;
	for (int i = 0; i < s.length; i++) {
		sum2=sum2+s[i][n1];
	}
	System.out.println(sum2);
}
}
