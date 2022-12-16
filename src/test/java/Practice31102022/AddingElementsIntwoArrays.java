package Practice31102022;

public class AddingElementsIntwoArrays {
public static void main(String[] args) {
	int []a= {2,4,6};
	int []b= {3,7,9,10};
	
	int length = a.length;
	if(a.length<b.length) {
		length=b.length;
		for (int i = 0; i < b.length; i++) {
			try {
				System.out.print(a[i]+b[i]+" ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.print(b[i]+" ");
			}
		}
	}
}
}
