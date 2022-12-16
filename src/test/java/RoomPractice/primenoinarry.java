package RoomPractice;

public class primenoinarry {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10,11};
	for (int i = 0; i < a.length; i++) {
		int no=a[i];  //5
		int j=2;
		while(true) {
			if(no%2==0) {
				break;
			}else {
				j++;
			}
		}
		if(j==no) {
System.out.println(a[i]+" ");
	}
	
}
}
}
