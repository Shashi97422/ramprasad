package Practice31102022;

public class SortAssendingOrder {
	public static void main(String[] args)
	{
		int []a= {11,2,3,24,5,6,7,8,9,10};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			System.out.print(a[i]+" ");
		}
		//System.out.println(a[0]);
	}
}
