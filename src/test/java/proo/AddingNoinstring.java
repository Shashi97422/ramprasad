package proo;

public class AddingNoinstring {
	public static void main(String[] args) {
		String s="A7R7F89H9Y8";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int n=s.charAt(i)-48;
				System.out.print(n+" ");
			}
		}
	}
}
