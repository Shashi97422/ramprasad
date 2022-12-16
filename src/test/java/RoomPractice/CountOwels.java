package RoomPractice;

import java.util.LinkedHashSet;

public class CountOwels {
public static void main(String[] args) {
	String s="aeeiou";
	char[] ch = s.toCharArray();
	int count = 0;
	LinkedHashSet<Character>set=new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')) {
			set.add(ch[i]);
			count++;
		}
	}
	System.out.println(set);
}
}
