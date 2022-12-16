package Practice31102022;

public class Arrange {
	public static void main(String[] args) {
		int []a= {1,0,0,1,1,0,1};   //000111
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				System.out.print(a[i]+" ");
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				System.out.print(a[i]+" ");
			}
		}
		}


	}
