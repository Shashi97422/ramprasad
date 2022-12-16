package RoomPractice;

import java.util.LinkedHashSet;

public class ChangeTheOrderofOccurance1 {
public static void main(String[] args) {
	String s="tester";
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		set.add(s.charAt(i));
	}
	for (Character ch : set) {
		int count=0;
		for (int i = s.length()-1; i >=0; i--) {
			if(ch==s.charAt(i)) {
				System.out.println(s.charAt(i)+1);
			}
		}
	}
}
}
