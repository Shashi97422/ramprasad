package Practice31102022;

public class Firstmaxwithoutbubblesort {
public static void main(String[]args) {
	int a[]= {50,90,40,70,95,50,60};
	int fmin=a[0], smin=a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i]<fmin) {
			smin=fmin;
			fmin=a[i];
		}
		else if(a[i]<smin) {
			smin=a[i];
		}
	}
	System.out.println(smin);
}
}
