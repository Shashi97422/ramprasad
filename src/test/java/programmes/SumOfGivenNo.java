package programmes;

public class SumOfGivenNo {
public static void main(String[] args) {
	int no=123;
	int sum=0;
	int rem=0;
	while(no!=0)
	{
		rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	System.out.println(sum);
}
}
