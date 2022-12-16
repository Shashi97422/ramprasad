package RoomPractice;

public class taketheavgfrom1to10 {
	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		for (int i = 1; i <=10; i++)
		{
//			int no = (i+i+1)/2; //1.5+2.5+
			sum=sum+i;
			avg = sum/i;
			System.out.println(avg);
			
		}
		
	}

}
