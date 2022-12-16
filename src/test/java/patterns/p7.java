package patterns;

public class p7 
{
	public static void main(String[] args) 
	{
    int n=5;
	for (int i = 1; i <=n; i++) //row
	{
		for (int j = 1; j <=i; j++)
		{
			System.out.print("  "); // increesing space
		}
		for (int j = i; j <n; j++) {
			System.out.print("* ");   //for degreesing star
		}
	for (int j = i; j <=n; j++) {
		System.out.print("* ");   //degreesing stars
	}
	System.out.println();
}
}
}
