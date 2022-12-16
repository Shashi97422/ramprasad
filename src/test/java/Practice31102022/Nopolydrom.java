package Practice31102022;

public class Nopolydrom {
public static void main(String[] args) {
	int n=232;
	int copy=n;
	int rev=0;
	while(n!=0) {
		int rem = n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==copy) {
		System.out.println("polydrom");
	}else {
		System.out.println("not");
	}
}
}
