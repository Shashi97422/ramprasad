package programmes;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int sum=0;
		int[][] a = {{1, 2, 3},
				     {4, 5, 6},
			       	 {7, 7, 8}};
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i][i];
		}
		
		int sum1=0;
		int m=0;
		for (int i = a.length-1; i >=0 ; i--) {
			sum1=sum1+a[i][m];
			m++;
		}
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum1-sum);
	}
	

}
