package proo;

public class noof {
	public static void main(String[] args) {
		int n=121;
		int copy=n;
		int rev = 0;


		while(n!=0) {
			int rem = n%10;
			rev=(rev*10)+rem;
			n=n/10;

		}
		if(copy==rev) {
			System.out.println("polydrom");
		}
	}
}
