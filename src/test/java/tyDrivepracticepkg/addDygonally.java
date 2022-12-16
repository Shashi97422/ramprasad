package tyDrivepracticepkg;

public class addDygonally {
	public static void main(String[] args) {
		int [][] s= {{1,2,5},
				     {4,5,6},
				     {7,8,9}};

		//for adding digonally from top right side
		int sum=0;
		for (int i = 0; i < s.length; i++) {
			sum=sum+s[i][i];
		}
		System.out.println(sum);

		//for adding digonally bottom to top
		int sum1=0;
		int n=2;
		
		for (int i = 0; i < s.length; i++) {
			sum1=sum1+s[i][n];
			n--;
		}
		System.out.println(sum1);
	}
}
