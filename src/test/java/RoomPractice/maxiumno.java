package RoomPractice;

public class maxiumno
{
	public static void main(String[] args) 
	{
		int []a= {95,10,90,20,60};
		int Fmin=a[0];
		int Smin=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(Fmin>a[i]) {
				Smin=Fmin;
				Fmin=a[i];
			}
			else if (Smin>a[i]) {
				Smin=a[i];
			}
		}
		System.out.println(Fmin);
	}
}


