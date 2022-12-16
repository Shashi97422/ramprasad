package Practice31102022;

public class FindMissingNumbers {
public static void main(String[] args) {
	int a[]= {2,3,5,7,8,11,14};
	for (int i = 0; i < a.length-1; i++) {
		int n = a[i+1]-a[i];
		int count=1;
		while(n>1) {
			System.out.println(a[i]+count);
			count++;
			n--;
		}
	}
}
}
