package programmes;

public class outputLogic {
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};     //output : 23451
		int key=1;
		for (int i = key; i <a.length; i++) {
			System.out.print(a[i]+" ");  // ??insted a[i] if i pass only i
		}
	for (int i = 0; i < key; i++) {
		System.out.print(a[i]+" ");
	}
	}
}

