package practice123;

public class primenumber {
	public static void main(String[] args) {
		int count=0;
		String s="your account number 1234 is generated sucessfully";
		String[] m = s.split(" ");
		for (int i = 0; i < m.length; i++) {
			count++;
		}
		System.out.println(count);
	}
}


