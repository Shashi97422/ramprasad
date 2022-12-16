package Practice31102022;

public class MaximumLengthofwordinaSentanance {
public static void main(String[] args) {
	String s="god better best";
	String[] m = s.split(" ");
	int maxLength = m[0].length();
	for (int i = 0; i < m.length; i++) {
		if(m[i].length()>maxLength) {
			maxLength=m[i].length();
		}
	}
for (int i = 0; i < m.length; i++) {
	if(m[i].length()==maxLength) {
	maxLength=m[i].length();
	System.out.println(m[i]);
	}
}
}
}
