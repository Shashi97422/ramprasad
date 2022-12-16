package RoomPractice;

public class MachingNumPrint {
public static void main(String[] args) {
	int [] a= {10,20,30,40,50};
	int [] b= {5,10,15,20,25,30,40};
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < b.length; j++) {
			if(a[i]==b[j]) {
				System.out.println(b[j]);
			}
		}
	}
}
}
