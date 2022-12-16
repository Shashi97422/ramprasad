package Practice31102022;

public class FindFibonosiseries {
	public static void main(String[] args) {
		int fib1=0;
		int fib2=1;
		int fib3;
		for (int i = fib1; i <5; i++) {
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(fib3+" ");
		}
	}
}