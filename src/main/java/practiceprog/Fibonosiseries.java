package practiceprog;

public class Fibonosiseries {
public static void main(String[] args) {
	int fib1=0;
	int fib2=1;
	int fib3;
	for (int i = fib1; i < 10; i++) {
		fib3=fib1+fib2;
		fib2=fib1;
		fib3=fib2;
	}
	System.out.println(fib3+" ");
}
}
