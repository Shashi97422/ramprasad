package RoomPractice;

public class sumtheprimenofrom1to25 {
	public static void main(String[] args) {
		int sum=0;
		for (int j = 1; j <=25; j++) {
			int no = j;
			int i=2;
			while(true)
			{
				if(no%i==0)
				{
					break;
				}
				else 
				{
					i++;
				}
			}
			if(no==i) 
			{
				sum=sum+i;
			}

		}
		System.out.println(sum);
	}
}
