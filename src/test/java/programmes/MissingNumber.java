package programmes;

public class MissingNumber {
	public static void main(String[] args) {
		int []a= {1,4,5,7,10,13};
		for (int i = 0; i < a.length-1; i++) {
			int n=a[i+1]-a[i]; //2-1=1 , 4-2=2  . 5-4=1 , 7-5=2 ,10-7=3
			int count=1;  //2
			while(n>1) {
				System.out.print(a[i]+count+" "); //3,6,8,9
				count++; //2,3
				n--; //1,2,1
			}
		}
	}
}
