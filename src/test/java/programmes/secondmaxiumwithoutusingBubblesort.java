package programmes;

public class secondmaxiumwithoutusingBubblesort {
	public static void main(String[] args) {
		int a[]= {50,90,40,70,95,50,60};
		int Fmax=0,Smax=0;
		for (int i = 0; i < a.length; i++) {
			if(Fmax<a[i]) {
				Smax=Fmax;
				Fmax=a[i];
				
			}
			else if(Smax<a[i]) {
				Smax=a[i];
			}
		}
		System.out.println("First max==> "+Fmax);
		System.out.println("Second Max==> "+Smax);
		
	}
}
