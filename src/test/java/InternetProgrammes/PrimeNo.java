package InternetProgrammes;

public class PrimeNo {
	public static void main(String[] args) {
		for (int j = 1; j <=100; j++) {
			
		
		int n=j;
		boolean flag = true;
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println(n+  "   prime");
		}else {
			//System.out.println("not");
		}
		}
}
}