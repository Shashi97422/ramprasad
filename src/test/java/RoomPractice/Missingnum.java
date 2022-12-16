package RoomPractice;

public class Missingnum {
public static void main(String[] args) {
	int []a= {1,2,4,5,7,10,13};
	for (int i = 0; i < a.length; i++) {
		int n = a[i+1]-a[i];
		int count = 1;
		while(n>1) 
		{
			System.out.print(a[i]+count+" ");
			count++;
			n--;
		}
	}
}
}
