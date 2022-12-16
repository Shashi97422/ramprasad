package InternetProgrammes;

public class ReverseTheNumUsungForLoop {
	public static void main(String[] args) {
		int n=76549;
		int rev=0;
		for (;n!=0;) 
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}
}
