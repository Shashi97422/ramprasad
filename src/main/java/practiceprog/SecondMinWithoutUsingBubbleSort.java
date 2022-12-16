package practiceprog;

public class SecondMinWithoutUsingBubbleSort {
	public static void main(String[] args) {
		int []a= {4,3,8,2,1,9};
		int Fmin=100,Smin=100;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<=Fmin) {
				Smin=Fmin;
				Fmin=a[i];
			}else {
				if(a[i]<=Smin) {
					Smin=a[i];
				}
			}
		}
		System.out.println(Fmin);
		System.out.println(Smin);
	}
}
