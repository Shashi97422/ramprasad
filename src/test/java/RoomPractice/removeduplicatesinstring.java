package RoomPractice;

import java.util.LinkedHashSet;

public class removeduplicatesinstring {
public static void main(String[] args) {
	String str="tester";
	char[] ch = str.toCharArray();
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for (int i = 0; i < ch.length; i++) {
		set.add(ch[i]);
	}
	System.out.println(set);
}

}
