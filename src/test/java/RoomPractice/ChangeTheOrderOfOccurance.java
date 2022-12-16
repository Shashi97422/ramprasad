package RoomPractice;

import java.util.LinkedHashSet;

public class ChangeTheOrderOfOccurance {
public static void main(String[] args) {
	String s="tester";
	char[] ch = s.toCharArray();
	LinkedHashSet<Character>set=new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		set.add(s.charAt(i));
	}
	for (Character chara : set) {
		for (int i = s.length()-1; i >=0; i--) {
			if(chara==s.charAt(i)) {
				System.out.println(chara+"="+(i+1));
				break;    
			}
		}
	}
}
}
