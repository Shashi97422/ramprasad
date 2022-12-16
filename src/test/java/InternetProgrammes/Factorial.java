package InternetProgrammes;

public class Factorial {
	public static void main(String[] args) {
		//factorial means for Ex : 6=6*5*4*3*2*1
		int n=5;
		int fact = 1;
		for (int i = n; i >=1; i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
}
