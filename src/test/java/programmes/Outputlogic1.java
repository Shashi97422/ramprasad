package programmes;

public class Outputlogic1 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};      // o/p= 3,4,5,1,2
	int key=2;
	for (int i = key; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	for (int i = 0; i < key; i++) {
		System.out.print(a[i]+" ");
	}
}
}
