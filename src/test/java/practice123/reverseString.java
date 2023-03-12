package practice123;

import java.util.Iterator;

public class reverseString {
public static void main(String[] args) {
	String s="java";
//	for (int i =s.length()-1; i>=0; i--) {
//		System.out.print(s.charAt(i));
//	}
	
	String rev="";
	for (int i = s.length()-1; i>=0; i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}
}
