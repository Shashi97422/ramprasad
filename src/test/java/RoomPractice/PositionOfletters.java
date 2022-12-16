package RoomPractice;

import java.util.LinkedHashSet;

public class PositionOfletters {
public static void main(String[] args) {
	String s="tester"; 
	LinkedHashSet<Character>set=new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		set.add(s.charAt(i));
	}
	for (Character ch : set) {
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==ch) {
				System.out.println(ch+" "+(i+1));
				break;
			}
		}
	}
}
}
