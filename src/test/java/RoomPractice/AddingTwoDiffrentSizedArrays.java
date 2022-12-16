package RoomPractice;

public class AddingTwoDiffrentSizedArrays {
public static void main(String[] args) {
	int a[]={2,4,6};
	int b[]={4,6,3,4};
	int length = a.length;
	if(a.length<b.length) {
		length=b.length;
		for (int i = 0; i < b.length; i++) {
			try {
				System.out.print(a[i]+b[i]+" ");
			} catch (Exception e) {
				System.out.print(b[i]+" ");
			}
		}
	}
}
}
