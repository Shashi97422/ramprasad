package programmes;

public class PrimeNoLogic1 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10,11};
	
	for (int j = 0; j < a.length; j++) 
	{
		int n=a[j];
		int i=2;
		while(true) {
			if(n%i==0) {
				break;
			}
			else {
				i++;
			}
		}
		if(i==n) 
		{
			System.out.print(a[j]+" ");
		}
	}
}
}
