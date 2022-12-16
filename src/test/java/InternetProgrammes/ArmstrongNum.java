package InternetProgrammes;

public class ArmstrongNum {
	public static void main(String[] args) {
		int no=153;
		int sum=0;
		int copy=no;
		while(no!=0) {
			int rem = no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;                                //
		}
		if(copy==sum) {
			System.out.println(sum+"  is Amstrong no");
		}else {
			System.out.println("not");
		}
	}
}
