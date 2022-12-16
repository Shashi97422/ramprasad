package RoomPractice;

public class Prime_numINarray {
public static void main(String[] args) {
	
	int []a= {1,2,3,4,5,6,7,8,9,10,11};
	for (int i = 0; i < a.length; i++) {
		int no = a[i];
		boolean flag = true;
		for (int j = 2; j < a[i]; j++) {
			if(a[i]%j==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.print(a[i]+" ");
		}
	}
	}
	
}


