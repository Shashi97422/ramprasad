package proo;

public class AddPrimeNoandaverageThem {
public static void main(String[] args) {
	int num=5;
	boolean flag=true;
	for (int i = 2; i < num; i++) {
		if(num%i==0) {
			flag=true;
			break;
		}
	}
	if(flag==true) {
		System.out.println("prime num");
	}

}
}
