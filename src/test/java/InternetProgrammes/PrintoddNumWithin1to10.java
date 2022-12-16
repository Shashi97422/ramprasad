package InternetProgrammes;

public class PrintoddNumWithin1to10 {
	public static void main(String[] args) {
		print(1);
	}
	static void print(int n)
	{
		if (n<=10) {
			if(n%2==1)
			{
				System.out.println(n);
			}
			n++;
			print(n);
		}
	}
}

