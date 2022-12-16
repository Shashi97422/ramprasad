package InternetProgrammes;

public class Polydrom {public static void main(String[] args) {


	int n=454;
	int temp=n;
	int sum = 0;
	while(n!=0) {
		int rem = n%10;
		sum=(sum*10)+rem;
		 n=n/10;

	}
	if(temp==sum) {
		System.out.println("polydrom");
	}else {
		System.out.println("not");
	}
}
}