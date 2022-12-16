package programmes;

public class AddingArray1 {
public static void main(String[] args) {
	int a[]= {2,4,6};
	int b[]= {3,7,9,13};
	int length=a.length;
	if(a.length<b.length) {
		length=b.length;
	}
for (int i = 0; i < b.length; i++) {
	try {
		System.out.print(a[i]+b[i]+" ");
		
	} catch (Exception e) {
		if(a.length<b.length) {
			System.out.println(b[i]);
		}else {
			System.out.println();
		}
	}
}
}
}
