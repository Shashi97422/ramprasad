package proo;

import java.util.Scanner;

public class VerifyMobileNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		long no=sc.nextLong();
		long copy=no;
		long count=0;
		while(no!=0) 
		{
			long rem = no%10;
			count++;
			no=no/10;
		}
		if(count==10)
		{
			System.out.println(copy+"  <--yes it is 10 degit number");
		}else {
			System.out.println("it is not 10 degit number");
		}
	}
}
