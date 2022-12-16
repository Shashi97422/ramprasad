package InternetProgrammes;

public class Print1to10WithoutusingLoop {
	public static void main(String[] args) {
		print(1);
	}
	static void print(int n) {
		if(n<=10) {
			System.out.println(n);
			n++;
			print(n);
		}
	}
}
