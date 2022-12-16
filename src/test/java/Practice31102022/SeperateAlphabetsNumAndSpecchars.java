package Practice31102022;

public class SeperateAlphabetsNumAndSpecchars {
public static void main(String[] args) {
	String s="iijiG778$%$%";
	String captial="";
	String small="";
	String num="";
	String spec="";
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)>='a' && s.charAt(i)<='z' ) {
			small=small+s.charAt(i);
		}else if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
			captial=captial+s.charAt(i);
		}else if(s.charAt(i)>=48 && s.charAt(i)<=57) {
			num=num+s.charAt(i);
		}else {
			spec=spec+s.charAt(i);
		}
	}
	System.out.println(spec);
}
}
