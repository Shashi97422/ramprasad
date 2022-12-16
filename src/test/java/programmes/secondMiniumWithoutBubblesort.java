package programmes;

public class secondMiniumWithoutBubblesort {
	public static void main(String[] args) {
		int a[]= {50,90,45,70,95,50,60};
		int Fmin=a[0],Smin=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<=Fmin) 
			{
				if(a[i]!=Fmin) 
				{
					Smin=Fmin;
				}
				Fmin=a[i];
			}
			else if(Fmin==Smin || Smin>a[i]) {
				Smin=a[i];
			}
		}
		System.out.println("First min==> "+Fmin);
		System.out.println("Second Min==> "+Smin);
		
	}
}
