package patterns;

public class p9 {
public static void main(String[] args) {
	int n=5;
	for (int i = 1; i <=n; i++) //rows
	{
		for (int j = 1; j <=n; j++)// columns
		{
			//System.out.print(i+" ");//row wise
			System.out.print(j+" ");  //column wise
		}
		System.out.println();
	}
}
}
