package patterns;

public class p15 {
public static void main(String[] args) {
	int n=5;
	
	for (int i = 1; i <=n; i++) 
	{
		int k=1;
		for (int j = i; j <=n; j++) {
			System.out.print("  ");  //for space
		}
		for (int j = 1; j <=i; j++) {
			System.out.print(j+" ");
		}
		for (int  j= 2; j <=i; j++) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
}
