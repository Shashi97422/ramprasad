package StringProgrammes;

public class ReverseString {
public static void main(String[] args) {
	//First Type
	 String s="tester";
	for (int i = s.length()-1; i >=0; i--) {
		System.out.print(s.charAt(i));
	}
	//*/
	//secend type
//	String s="tester";
//	char[] str=s.toCharArray();
//	for (int i = str.length-1; i >=0; i--) {
//		System.out.print(str[i]);
//	}
	
	//using 3rd variable
	/*String s="tester";
	String rev="";
	for (int i = s.length()-1; i >=0; i--) {
		rev=rev+s.charAt(i);
	}
	System.out.print(rev);  */
}
}
