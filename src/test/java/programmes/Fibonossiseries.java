package programmes;

public class Fibonossiseries {
	public static void main(String[] args) {      //find fibonoseries b/w 1 to 10
		int fib1=0;
		int fib2=1;
		int fib3;
		for (int i = fib1; i <10; i++) {
			fib3=fib1+fib2;
			//System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
			System.out.print(fib3+" ");
			
		}
	}
}
