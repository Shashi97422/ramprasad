package RoomPractice;

public class primeNo {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,10,11};
		for (int j = 0; j < a.length; j++) {


			int no=a[j]; //5
			int i=2;
			while(true) {
				if(no%i==0) {
					break;
				}else {
					i++; //5
				}
			}
			if(i==no) {
				System.out.print(a[j]+" ");	
			
//		}else {
//			System.out.print(a[j]+" ");
		}
	}
	}
}
