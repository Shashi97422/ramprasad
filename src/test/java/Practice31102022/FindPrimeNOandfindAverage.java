package Practice31102022;

public class FindPrimeNOandfindAverage {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int sum=0;
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			int n=a[i];
			boolean flag=true;
			for (int j = 2; j <n; j++) {
				if(n%j==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				count++;
				sum=sum+a[i];

			}
		}
		
		System.out.println(sum);
		System.out.println(count);
		System.out.println("average ==> "+sum/count);
	}
}