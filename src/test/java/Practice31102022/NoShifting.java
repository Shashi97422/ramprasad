package Practice31102022;

public class NoShifting {
public static void main(String[] args) {
	int[]a= {1,2,3,4,5};    // o/p ==>34512
	int key = 2;
	for (int i = key; i < a.length; i++) {
		System.out.println(a[i]);
	}
	for (int i = 0; i < key; i++) {
		System.out.println(a[i]);
	}
}
}
