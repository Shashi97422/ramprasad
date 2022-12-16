package Practice31102022;

public class SortWithoutUsingBubblesort {
	public static void main(String[] args) {
		int []a= {11,2,5,15,7};
		int fmin=a[0];
		int smin=a[0];
		for (int i = 0; i < a.length; i++) {

			if(a[i]<fmin) 
			{
				if(a[i]<smin) {
					smin=a[i];
				}
				fmin=a[i];
			}else 
				if(fmin==smin || smin>a[i])
			{
					smin=a[i];
			}
		}
		System.out.println(smin);
	}
}
