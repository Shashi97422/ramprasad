package StringProgrammes;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInString {
public static void main(String[] args) {
	String s="tester";
	s.toCharArray();    //used to convert char array
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for (int i = 0; i <s.length(); i++) {
		set.add(s.charAt(i));
	}
	System.out.println(set); 
	
	/* char []ch=str.toCharArray();
	for (int i = 0; i < ch.length; i++) {
	set.add(ch[i]);
	}
	System.out.print(set+" "); */
}
}
