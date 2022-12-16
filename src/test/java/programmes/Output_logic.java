package programmes;

import java.util.Scanner;

public class Output_logic {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};                      //if n=1  output=20,30,40,50,10     or if n=2 o/o =30,40,50,10,20
		//	System.out.println("Enter the value");
		//	Scanner s=new Scanner(System.in);
		//	int key1=s.nextInt();
		//	for (int i = key1; i < a.length; i++) {
		//		System.out.print(a[i]+" ");
		//	}
		//	for (int i = 0; i < key1; i++) {
		//		System.out.print(a[i]+" ");
		//	}
		//	int key2=s.nextInt();
		//	for (int i = key2; i < a.length; i++) {
		//		System.out.print(a[i]+" ");
		//	}
		//	for (int i = 0; i <key2; i++) {
		//		System.out.print(a[i]+" ");
		//	}
		int key=2;
		for (int i = 0; i < key; i++) {
			int temp = a[0];
			for (int j = 1; j < a.length; j++) {
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
