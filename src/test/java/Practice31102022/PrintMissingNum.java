package Practice31102022;

public class PrintMissingNum {
	public static void main(String[] args) {
		int []a= {1,2,5,7,10};

		for (int i = 0; i < a.length-1; i++) {
			int n = a[i+1]-a[i]; //3
			int count=1; //3
			while(n>1) {
				System.out.println(a[i]+count+" ");
				count++;
				n--;  //1
			}
		}
	}
}
