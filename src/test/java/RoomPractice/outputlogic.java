package RoomPractice;

public class outputlogic {
public static void main(String[] args) {
	int key=1;
	int a[]= {1,2,3,4,5};     //output : 23451
	for (int i = key; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	for (int i = 0; i < key; i++) {
		System.out.println(a[i]+" ");
	}
}
}
