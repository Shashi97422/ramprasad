package Practice31102022;

public class AddtheNumFromString {
public static void main(String[] args) {
	String s="ds1jk3kk4";
	int sum=0;
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			sum=sum+s.charAt(i)-48;
		}
	}
	System.out.println(sum);
}
}
