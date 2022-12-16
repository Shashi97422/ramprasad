package programmes;

public class logicp2 {
	public static void main(String[] args) 
	{
		int a[]= {3,0,0,5,1,0,2};    // output : 0003512  
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==0) {
				System.out.print(a[i]+" ");
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}

