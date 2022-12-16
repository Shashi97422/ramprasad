package Practice31102022;

public class Different_WaysTo_ReverseA_String {
public static void main(String[] args) {
	String s="india";
	
//	for (int i = 0; i < s.length(); i++) {
//		int j = s.length()-1;
//		System.out.print(s.charAt(j-i));
//	}
	
//	String rev="";
//	for (int i = 0; i < s.length();) {
//		rev=s.charAt(i)+rev;
//		i++;
//	}
//	System.out.print(rev);
	
//	String rev="";
//	for(int i=0;;) {
//		if(i<=s.length()-1) {
//			rev=rev+s.charAt(s.length()-(++i));
//		}else {
//			break;
//		}
//	}
//	System.out.print(rev);
	
	for (int i = s.length()-1; i >=0 ; i--) {
		System.out.print(s.charAt(i));
	}
}
}
