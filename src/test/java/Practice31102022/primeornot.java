package Practice31102022;

public class primeornot {
	public static void main(String[] args) {
		int []a= {2,3,4,5,6,7,8,9,10,11};
		for (int i = 0; i < a.length; i++) {


			int n=a[i];
			boolean flag=true;
			for (int j = 2; j < n; j++) {
				if(n%j==0) {
					flag=false;
					break;
				}
			}if(flag==true) {
				System.out.println(a[i]+"  prime");
			}else {
				System.out.println(a[i]+"  not");
			}
		}
	}
}